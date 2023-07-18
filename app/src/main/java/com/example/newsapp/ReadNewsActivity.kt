package com.example.newsapp


import ai.conscent.registrationpaywall.RegistrationPaywall
import ai.conscent.regularpaywalls.RegularPaywall
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.Voice
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.get
import androidx.lifecycle.ViewModelProvider
import com.conscent.framework.core.Conscent
import com.conscent.framework.core.ConscentWrapper
import com.conscent.framework.core.OnConscentListener
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
import com.squareup.picasso.Picasso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class ReadNewsActivity : AppCompatActivity(), TextToSpeech.OnInitListener , OnConscentListener {
    val TAG = ReadNewsActivity::class.java.simpleName
    private lateinit var viewModel: NewsViewModel
    private lateinit var newsData: ArrayList<NewsModel>
    private lateinit var tts: TextToSpeech
    private lateinit var binding: ActivityReadNewsBinding
    lateinit var conscentWrapper: ConscentWrapper
    private lateinit var menu: Menu

    lateinit var conscent: Conscent
    private var showSubscriptions: Boolean = false
    private var scollLength:Int = 0

    private lateinit var parent: ConstraintLayout
    private lateinit var frame: FrameLayout


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
        val contentId:String? = intent.getStringExtra(CONTENT_ID)

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


        if (contentId != null) {

            Log.d("contentId:",contentId)
            conscent = ConscentWrapper.getConscentInstance(
                this,
                parent,
                frame,
                contentId,
                this
            )
            RegistrationPaywall.initRegistrationPaywall()
            RegularPaywall.initRegularPaywall()
            conscent.popUpContainer = binding.popUp


            onNewIntent(null)
        }

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
        setOf("NA", "f00", "202007071", "female", null)
    )
    private val addedVoices: Set<Voice> = setOf(voice1, voice2)

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_item_readnewsactivity, menu)
        this.menu = menu
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
                    conscent.onSoftSubscribeClick()
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

    override fun onAdFree(clientId: String, contentId: String?) {
        Log.d(TAG, "onAdFree: ")
    }

    override fun onBuyPass(clientId: String, contentId: String) {
        Log.d(TAG, "onBuyPass: ")
    }

    override fun onError(clientId: String, contentId: String, errorMsg: String) {
        Log.e(TAG, "onError: $errorMsg")
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
}