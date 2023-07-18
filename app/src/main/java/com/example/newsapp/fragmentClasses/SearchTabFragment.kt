package com.example.newsapp.fragmentClasses

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.NewsModel
import com.example.newsapp.R
import com.example.newsapp.ReadNewsActivity
import com.example.newsapp.adapters.CustomAdapter
import com.example.newsapp.databinding.FragmentAccountTabBinding
import com.example.newsapp.databinding.FragmentSearchTabBinding
import com.example.newsapp.utils.Constants
import kotlinx.coroutines.Job

class SearchTabFragment : Fragment() {

    private lateinit var binding: FragmentSearchTabBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_search_tab,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsData: MutableList<NewsModel> = HomeNavHostFragment.entertainmentNews
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
                }

                startActivity(intent)
            }
        })

        // Ignore
        adapter.setOnItemLongClickListener(object : CustomAdapter.OnItemLongClickListener {
            override fun onItemLongClick(position: Int) = Unit
        })


        var job: Job? = null

        binding.searchNews.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // on below line we are checking
                // if query exist or not.
//                if (programmingLanguagesList.contains(query)) {
//                    // if query exist within list we
//                    // are filtering our list adapter.
//                    listAdapter.filter.filter(query)
//                } else {
//                    // if query is not present we are displaying
//                    // a toast message as no  data found..
//                    Toast.makeText(this@MainActivity, "No Language found..", Toast.LENGTH_LONG)
//                        .show()
//                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // if query text is change in that case we
                // are filtering our adapter with
                // new text on below line.
//                listAdapter.filter.filter(newText)
                return false
            }
        })

    }


}