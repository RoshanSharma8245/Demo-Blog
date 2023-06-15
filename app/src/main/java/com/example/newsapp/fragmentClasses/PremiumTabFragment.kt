package com.example.newsapp.fragmentClasses

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.NewsModel
import com.example.newsapp.R
import com.example.newsapp.ReadNewsActivity
import com.example.newsapp.adapters.CustomAdapter
import com.example.newsapp.fragmentClasses.HomeNavHostFragment.Companion.businessNews
import com.example.newsapp.utils.Constants


class PremiumTabFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_premium_tab, container, false)
        val newsData: MutableList<NewsModel> = businessNews
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter = CustomAdapter(newsData)
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : CustomAdapter.OnItemClickListener {

            override fun onItemClick(position: Int) {
                val intent = Intent(context, ReadNewsActivity::class.java).apply {
                    putExtra(Constants.NEWS_URL, newsData[position].url)
                    putExtra(Constants.NEWS_TITLE, newsData[position].headLine)
                    putExtra(Constants.NEWS_IMAGE_URL, newsData[position].image)
                    putExtra(Constants.NEWS_DESCRIPTION, newsData[position].description)
                    putExtra(Constants.NEWS_SOURCE, newsData[position].source)
                    putExtra(Constants.NEWS_PUBLICATION_TIME, newsData[position].time)
                    putExtra(Constants.NEWS_CONTENT, newsData[position].content)
                    putExtra(Constants.NEWS_AUTHOR, newsData[position].author)
                    putExtra(Constants.CONTENT_ID, "Client-Story-Id-1")
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


}