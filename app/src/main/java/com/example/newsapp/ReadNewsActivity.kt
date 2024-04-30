package com.example.newsapp

import ai.conscent.meterbanner.MeterBanner
import ai.conscent.registrationpaywall.RegistrationPaywall
import ai.conscent.regularpaywalls.RegularPaywall
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.Voice
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.FrameLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.get
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.conscent.framework.callbacklistener.OnConscentListener
import com.conscent.framework.core.Conscent
import com.conscent.framework.core.ConscentWrapper
import com.example.newsapp.architecture.NewsViewModel
import com.example.newsapp.databinding.ActivityReadNewsBinding
import com.example.newsapp.utils.Constants.CONTENT_ID
import com.example.newsapp.utils.Constants.NEWS_AUTHOR
import com.example.newsapp.utils.Constants.NEWS_CONTENT
import com.example.newsapp.utils.Constants.NEWS_DESCRIPTION
import com.example.newsapp.utils.Constants.NEWS_IMAGE_URL
import com.example.newsapp.utils.Constants.NEWS_PUBLICATION_TIME
import com.example.newsapp.utils.Constants.NEWS_SOURCE
import com.example.newsapp.utils.Constants.NEWS_TITLE
import com.example.newsapp.utils.Constants.NEWS_URL
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.squareup.picasso.Picasso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import com.example.newsapp.retrofit.GenerateToken
import com.example.newsapp.retrofit.RetrofitBuilder
import com.example.newsapp.retrofit.TempAuthTokenResponse
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.util.Base64


class ReadNewsActivity : AppCompatActivity(), TextToSpeech.OnInitListener, OnConscentListener {
    val TAG = ReadNewsActivity::class.java.simpleName
    private lateinit var viewModel: NewsViewModel
    private lateinit var newsData: ArrayList<NewsModel>
    private lateinit var tts: TextToSpeech
    private lateinit var binding: ActivityReadNewsBinding
    lateinit var conscentWrapper: ConscentWrapper
    private lateinit var menu: Menu

    lateinit var conscent: Conscent
    private var showSubscriptions: Boolean = false
    private var scollLength: Int = 0

    private lateinit var parent: ConstraintLayout
    private lateinit var frame: FrameLayout
    // [START declare_auth]
    private lateinit var auth: FirebaseAuth
    // [END declare_auth]
    private lateinit var googleSignInClient: GoogleSignInClient


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        if (!showSubscriptions) {
            conscent.checkContentAccess(
                "",
                "",
                true,
                showClose = false
            )
        } else {
            conscent.checkSubscriptions(
                "",
                "",
                false,
            )
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)
        setSupportActionBar(toolbar)

        toolbar.setNavigationOnClickListener {
            onBackPressed() // Implemented by activity
        }

        parent = findViewById(R.id.parent)
        frame = findViewById(R.id.frame)

        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]

        //loading data into list
        newsData = ArrayList(1)
        val newsUrl = intent.getStringExtra(NEWS_URL)
        val contentId: String? = intent.getStringExtra(CONTENT_ID)

//        ConscentWrapper.changeClientId("5f92a62013332e0f667794dc")

        val newsContent =
            intent.getStringExtra(NEWS_CONTENT)
        newsData.add(
            NewsModel(
                intent.getStringExtra(NEWS_TITLE)!!,
                intent.getStringExtra(NEWS_IMAGE_URL),
                intent.getStringExtra(NEWS_DESCRIPTION),
                newsUrl,
                intent.getStringExtra(NEWS_SOURCE),
                intent.getStringExtra(NEWS_AUTHOR),
                intent.getStringExtra(NEWS_PUBLICATION_TIME),
                newsContent
            )
        )

        binding.title.text = newsData[0].headLine
        binding.tvContent.text = newsData[0].content
        binding.tvDescription.text = newsData[0].description
        binding.author.text = newsData[0].author
        binding.date.text = newsData[0].time


        val input = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:SS'Z'")
        val output = SimpleDateFormat("dd/MM/yyyy")

        var d: Date? = null
        try {
            d = newsData[0].time?.let { input.parse(it) }
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        val formatted = d?.let { output.format(it) }
        Log.i("DATE", "" + formatted)
        binding.date.text = formatted.toString()

        Picasso.get()
            .load(newsData[0].image)
            .fit()
            .centerCrop()
            .error(R.drawable.samplenews)
            .into(binding.imgView)


        //text to speech
        tts = TextToSpeech(this, this)


        /***  Initialize the paywall  ***/
        if (contentId != null) {

            Log.d("contentId:", contentId)
            conscent = ConscentWrapper.getConscentInstance(
                this,
                binding.parent,
                binding.frame,
                binding.popUp,
                "Client-Story-Id-${contentId}",
                this
            )
            MeterBanner.initMeterBanner()
            RegistrationPaywall.initRegistrationPaywall() /***  Registration Paywall in beta  ***/
//            TimerPaywall.initTimerPaywall() /***  Timer Paywall in beta  ***/
            RegularPaywall.initRegularPaywall()
//            NewPaywall.initNewPaywall()



            onNewIntent(null)
        }

        // [START config_signin]
        // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)
        // [END config_signin]

        // [START initialize_auth]
        // Initialize Firebase Auth
        auth = Firebase.auth
        // [END initialize_auth]

    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        Log.d("Touch", "touch_event_has_occured")
        if (this::conscent.isInitialized) {
            conscent.onTouch()
        }
        return super.dispatchTouchEvent(event)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                // Google Sign In was successful, authenticate with Firebase
                val account = task.getResult(ApiException::class.java)!!
                Log.d(TAG, "firebaseAuthWithGoogle:" + account.id)
                firebaseAuthWithGoogle(account.idToken!!)
            } catch (e: ApiException) {
                // Google Sign In failed, update UI appropriately
                Log.w(TAG, "Google sign in failed", e)
            }
        }

        Log.i("Result", "RedirectionHandler.onActivityResult: ")
        if (resultCode == RESULT_OK) {
            if (data?.getStringExtra("TYPE") == "PLANS") {
                conscent.checkSubscriptions(
                    "TestingPreferences.getContentTitle()",
                    "TestingPreferences.getSubscriptionUrl()",
                )
            } else
                conscent.handledIntent()
        }
        if (resultCode == RESULT_OK) {

            if (data?.getStringExtra("STATUS") == "true"){
                Log.i(TAG, "RedirectionHandler.onActivityResult: true ")
                Toast.makeText(applicationContext,"${data?.getStringExtra("STATUS")}", Toast.LENGTH_LONG).show()
            }else{
                Log.i(TAG, "RedirectionHandler.onActivityResult: false ")
            }
        }
    }


    override fun onInit(status: Int) {

        if (status == TextToSpeech.SUCCESS) {
            val result = tts.setLanguage(Locale.ENGLISH)
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Toast.makeText(this, "TTS Not Supported for this news", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    private fun playNews() {
        tts.speak(newsData[0].content, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    // Adding voices
    private val voice1: Voice = Voice(
        "en-US-SMTf00",
        Locale("en", "USA"),
        300,
        300,
        false,
        setOf("NA", "f00", "202009152", "female", null)
    )
    private val voice2: Voice = Voice(
        "en-IN-SMTf00",
        Locale("en", "IND"),
        300,
        300,
        false,
        setOf("NA", "f00", "202007071", "female", null) //8765456776
    )
    private val addedVoices: Set<Voice> = setOf(voice1, voice2)

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_item_readnewsactivity, menu)
        this.menu = menu
        val contentId: String? = intent.getStringExtra(CONTENT_ID)
        if(contentId == null){
            menu[0].isVisible = false
        }
        menu[1].subMenu?.get(0)?.isVisible = false

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.share_news -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_TEXT, "Hey, checkout this news : " + newsData[0].url)
                intent.type = "text/plain"
                startActivity(Intent.createChooser(intent, "Share with :"))
                return true
            }

            R.id.save_news -> {
                this.let { viewModel.insertNews(this@ReadNewsActivity, newsData[0]) }
                Toast.makeText(this, "News saved!", Toast.LENGTH_SHORT)
                    .show()
            }

            R.id.browse_news -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(newsData[0].url))
                startActivity(intent)
            }

//             Menu items for vocal news
            R.id.play_news -> {
                playNews()
            }

            R.id.stop_news -> {
                tts.stop()
            }

            R.id.speed_075x -> {
                tts.stop()
                tts.setSpeechRate(0.75F)
                playNews()
            }

            R.id.speed_1x -> {
                tts.stop()
                tts.setSpeechRate(1F)
                playNews()
            }

            R.id.speed_2x -> {
                tts.stop()
                tts.setSpeechRate(2F)
                playNews()
            }

            R.id.voice1 -> {

                tts.stop()
                tts.voice = addedVoices.elementAt(0)
                playNews()

            }

            R.id.voice2 -> {
                tts.stop()
                tts.voice = addedVoices.elementAt(1)
                playNews()
            }
            R.id.subscription ->{
                CoroutineScope(Dispatchers.IO).launch {
                    conscent.onSoftSubscribeClick("https://csc-subs-stage.netlify.app?clientId=6336e56f047afa7cb875739e")
                }

            }

            else -> return super.onOptionsItemSelected(item)
        }

        return true
    }

    override fun onDestroy() {
        tts.stop()
        tts.shutdown()
        super.onDestroy()
    }

    override fun eventParams(
        paywallId: String,
        contentId: String,
        paywallType: String,
        clientId: String,
        anonId: String
    ) {
        Log.d(TAG, "eventParams: $paywallId, $contentId, $paywallType, $clientId, $anonId")
    }

    /** You can pass a listener which will get called after success or failure in processing.
     *  If you pass a listener, after successful processing, the success reference will be called and for a failed event,
     *  the failure event will be called  **/
    override fun onAdFree(clientId: String, contentId: String?) {
        Log.d(TAG, "onAdFree: ")
    }

    override fun onBuyPass(clientId: String, contentId: String) {
        Log.d(TAG, "onBuyPass: ")
    }

    override fun onError(clientId: String, contentId: String, errorMsg: String) {
        Log.e(TAG, "onError: $errorMsg")
    }

    override fun onGoogleLoginClick() {
        Log.d(TAG, "onGoogleLoginClick: ")
        signIn()
    }

    override fun onSignIn(clientId: String, contentId: String) {
        Log.d(TAG, "signIn: ")
    }

    override fun onSubscribe(clientId: String, contentId: String) {
        Log.d(TAG, "onSubscribe: ")
    }

    override fun onSuccess(clientId: String, contentId: String) {
        Log.d(TAG, "onSuccess: ")
        menu[1].subMenu?.get(0)?.isVisible = true
    }
    companion object {
        private const val RC_SIGN_IN = 9001
    }

    // [START signin]
    private fun signIn() {
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    // [START auth_with_google]
    @RequiresApi(Build.VERSION_CODES.O)
    private fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "signInWithCredential:success")
                    val user = auth.currentUser

                    updateUI(user)
                    autoLogin(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "signInWithCredential:failure", task.exception)
                    updateUI(null)
                }
            }
    }
    // [END auth_with_google]

    private fun updateUI(user: FirebaseUser?) {
        Log.d("firebaseAuthWithGoogle", "called")

        Log.d("firebaseAuthWithGoogle", "${user?.email}")
        Log.d("firebaseAuthWithGoogle", "${user?.displayName}")
        Log.d("firebaseAuthWithGoogle", "${user?.photoUrl}")
        Log.d("firebaseAuthWithGoogle", "${user?.isAnonymous}")
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun autoLogin(user: FirebaseUser?) {
        val email = user?.email
        val phoneNumber = ""
        var tempToken: TempAuthTokenResponse? = null
        var message:String


        lifecycleScope.launch {
            try {
                tempToken = withContext(Dispatchers.IO) {
                    RetrofitBuilder.apiService.generateTempToken(GenerateToken(email!!, phoneNumber))
                }
            }catch (e:Exception){
                message = e.localizedMessage?.toString() ?: "ERROR"
            }

            Log.i(TAG, "TempToken: $tempToken")

            if (tempToken?.error != null){
                tempToken?.message.let {
                    message = it ?: tempToken?.error!!
                }
            }else{
                message = tempToken?.tempAuthToken.toString()
                val encodedEmail =  Base64.getEncoder().encodeToString(email!!.toByteArray())
                tempToken?.tempAuthToken?.let {
                    ConscentWrapper.INSTANCE?.autoLogin(
                        email = encodedEmail,
                        phoneNumber = phoneNumber,
                        clientActivity = this@ReadNewsActivity,
                        tempToken = it
                    )
                }
            }
        }
    }
}