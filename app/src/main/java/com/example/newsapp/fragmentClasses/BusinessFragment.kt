package com.example.newsapp.fragmentClasses

import ai.conscent.registrationpaywall.RegistrationPaywall
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.conscent.framework.callbacklistener.OnConscentListener
import com.conscent.framework.core.Conscent
import com.conscent.framework.core.ConscentWrapper
import com.example.new_meterbanner.MeterBanner
import com.example.new_paywalls.Paywall
import com.example.newsapp.NewsModel
import com.example.newsapp.R
import com.example.newsapp.ReadNewsActivity
import com.example.newsapp.adapters.CustomAdapter
import com.example.newsapp.fragmentClasses.HomeNavHostFragment.Companion.businessNews
import com.example.newsapp.retrofit.GenerateToken
import com.example.newsapp.retrofit.RetrofitBuilder
import com.example.newsapp.retrofit.TempAuthTokenResponse
import com.example.newsapp.utils.Constants.NEWS_AUTHOR
import com.example.newsapp.utils.Constants.NEWS_CONTENT
import com.example.newsapp.utils.Constants.NEWS_DESCRIPTION
import com.example.newsapp.utils.Constants.NEWS_IMAGE_URL
import com.example.newsapp.utils.Constants.NEWS_PUBLICATION_TIME
import com.example.newsapp.utils.Constants.NEWS_SOURCE
import com.example.newsapp.utils.Constants.NEWS_TITLE
import com.example.newsapp.utils.Constants.NEWS_URL
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Base64

class BusinessFragment : Fragment(), OnConscentListener {

    private lateinit var tv_status: TextView
    private lateinit var paywall_view: FrameLayout
    private lateinit var popup_view: FrameLayout
    private lateinit var parent_view: ConstraintLayout
    lateinit var conscent: Conscent

    private var showSubscriptions: Boolean = false
    // [START declare_auth]
    private lateinit var auth: FirebaseAuth
    // [END declare_auth]
    private lateinit var googleSignInClient: GoogleSignInClient

    var TAG = "BusinessFragment"
    override fun onResume() {
        super.onResume()
        conscent.checkContentAccess("",)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_business, container, false)
        val newsData: MutableList<NewsModel> = businessNews
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter = CustomAdapter(newsData)
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : CustomAdapter.OnItemClickListener {

            override fun onItemClick(position: Int) {
                val intent = Intent(context, ReadNewsActivity::class.java).apply {
                    putExtra(NEWS_URL, newsData[position].url)
                    putExtra(NEWS_TITLE, newsData[position].headLine)
                    putExtra(NEWS_IMAGE_URL, newsData[position].image)
                    putExtra(NEWS_DESCRIPTION, newsData[position].description)
                    putExtra(NEWS_SOURCE, newsData[position].source)
                    putExtra(NEWS_PUBLICATION_TIME, newsData[position].time)
                    putExtra(NEWS_CONTENT, newsData[position].content)
                    putExtra(NEWS_AUTHOR, newsData[position].author)
                }

                startActivity(intent)

            }
        })

        // Ignore
        adapter.setOnItemLongClickListener(object : CustomAdapter.OnItemLongClickListener {
            override fun onItemLongClick(position: Int) = Unit
        })

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        parent_view = view.findViewById<ConstraintLayout>(R.id.parent)
        paywall_view = view.findViewById<FrameLayout>(R.id.frame)
        popup_view = view.findViewById<FrameLayout>(R.id.frame)
//        tv_status = view.findViewById<TextView>(R.id.tv_status)





        conscent = ConscentWrapper.getConscentInstance(
            requireActivity(),
            parent_view,
            paywall_view,
            popup_view,
            "Client-Story-Id-1",
            this
        )
        Paywall.initNewPaywall()
        RegistrationPaywall.initRegistrationPaywall()
        MeterBanner.initMeterBanner()


        showSubscriptions = false


        // [START config_signin]
        // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(requireActivity(), gso)
        // [END config_signin]

        // [START initialize_auth]
        // Initialize Firebase Auth
        auth = Firebase.auth
        // [END initialize_auth]
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        Log.i(TAG, "RedirectionHandler.onActivityResult: ")
        if (resultCode == AppCompatActivity.RESULT_OK) {
            conscent.handledIntent()
        }
        if (resultCode == AppCompatActivity.RESULT_OK) {

            if (data?.getStringExtra("STATUS") == "true"){
                Log.i(TAG, "RedirectionHandler.onActivityResult: true ")
                Toast.makeText(requireContext(),"${data?.getStringExtra("STATUS")}", Toast.LENGTH_LONG).show()
            }else{
                Log.i(TAG, "RedirectionHandler.onActivityResult: false ")
            }
        }
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
    }

    override fun onSignIn(clientId: String, contentId: String) {
        Log.d(TAG, "signIn: ")
    }

    override fun onSubscribe(clientId: String, contentId: String) {
        Log.d(TAG, "onSubscribe: ")
    }

    override fun onSuccess(clientId: String, contentId: String) {
        Log.d(TAG, "onSuccess: ")
    }

    override fun onDestroyView() {
        conscent.onDestroy()
        super.onDestroyView()
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

}