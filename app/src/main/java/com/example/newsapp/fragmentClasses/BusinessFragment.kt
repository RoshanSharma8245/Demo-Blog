package com.example.newsapp.fragmentClasses

import ai.conscent.regularpaywalls.RegularPaywall
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.conscent.framework.core.Conscent
import com.conscent.framework.core.ConscentWrapper
import com.conscent.framework.core.OnConscentListener
import com.example.newsapp.MainActivity
import com.example.newsapp.NewsModel
import com.example.newsapp.R
import com.example.newsapp.ReadNewsActivity
import com.example.newsapp.adapters.CustomAdapter
import com.example.newsapp.fragmentClasses.HomeNavHostFragment.Companion.businessNews
import com.example.newsapp.utils.Constants.NEWS_AUTHOR
import com.example.newsapp.utils.Constants.NEWS_CONTENT
import com.example.newsapp.utils.Constants.NEWS_DESCRIPTION
import com.example.newsapp.utils.Constants.NEWS_IMAGE_URL
import com.example.newsapp.utils.Constants.NEWS_PUBLICATION_TIME
import com.example.newsapp.utils.Constants.NEWS_SOURCE
import com.example.newsapp.utils.Constants.NEWS_TITLE
import com.example.newsapp.utils.Constants.NEWS_URL

class BusinessFragment : Fragment(), OnConscentListener {

    private lateinit var tv_status: TextView
    private lateinit var paywall_view: FrameLayout
    private lateinit var parent_view: ConstraintLayout
    lateinit var conscent: Conscent

    private var showSubscriptions: Boolean = false

    var TAG = "BusinessFragment"
    override fun onResume() {
        super.onResume()
        if (!showSubscriptions) {
            conscent.checkContentAccess(
                "",
                "",
                canSubscribe = true,
                showClose = true
            )
        } else {
            conscent.checkSubscriptions(
                "",
                "",
                false,
            )
        }
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
//        tv_status = view.findViewById<TextView>(R.id.tv_status)





        conscent = ConscentWrapper.getConscentInstance(
            requireActivity(),
            parent_view,
            paywall_view,
            "1",
            this
        )
        RegularPaywall.initRegularPaywall()


        showSubscriptions = false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.i(TAG, "RedirectionHandler.onActivityResult: ")
        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data?.getStringExtra("TYPE") == "PLANS") {
                conscent.checkSubscriptions(
                    "",
                    "",
                )
            } else
                conscent.handledIntent()
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

    override fun onSignIn(clientId: String, contentId: String) {
        Log.d(TAG, "signIn: ")
    }

    override fun onSubscribe(clientId: String, contentId: String) {
        Log.d(TAG, "onSubscribe: ")
    }

    override fun onSuccess(clientId: String, contentId: String) {
        Log.d(TAG, "onSuccess: ")
    }

}