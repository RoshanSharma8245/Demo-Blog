package com.example.newsapp.fragmentClasses

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.MainActivity
import com.example.newsapp.NewsModel
import com.example.newsapp.R
import com.example.newsapp.adapters.FragmentAdapter
import com.example.newsapp.architecture.NewsViewModel
import com.example.newsapp.utils.Constants
import com.example.newsapp.utils.Constants.TOTAL_NEWS_TAB
import com.facebook.shimmer.ShimmerFrameLayout
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeNavHostFragment : Fragment() {

    // Tabs Title


    private lateinit var viewModel: NewsViewModel
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var fragmentAdapter: FragmentAdapter
    private lateinit var shimmerLayout: ShimmerFrameLayout
    private var totalRequestCount = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_navhost_home, container, false)

        // Set Action Bar
//        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
//        view.setSupportActionBar(toolbar)

        tabLayout = view.findViewById(R.id.tab_layout)
        viewPager = view.findViewById(R.id.view_pager)
        shimmerLayout = view.findViewById(R.id.shimmer_layout)

        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        // Send request call for news data
        requestNews(Constants.GENERAL, generalNews, view)
        requestNews(Constants.BUSINESS, businessNews, view)
        requestNews(Constants.ENTERTAINMENT, entertainmentNews, view)
        requestNews(Constants.HEALTH, healthNews, view)
        requestNews(Constants.SCIENCE, scienceNews, view)
        requestNews(Constants.SPORTS, sportsNews, view)
        requestNews(Constants.TECHNOLOGY, techNews, view)

        fragmentAdapter = FragmentAdapter(requireActivity())
        viewPager.adapter = fragmentAdapter
        viewPager.visibility = View.GONE

        if (!isNetworkAvailable(requireContext())) {
            shimmerLayout.visibility = View.GONE
            val showError: TextView = view.findViewById(R.id.display_error)
            showError.text = getString(R.string.internet_warming)
            showError.visibility = View.VISIBLE
        }

        // Inflate the layout for this fragment
        return view
    }

    private fun requestNews(newsCategory: String, newsData: MutableList<NewsModel>, view: View) {
        viewModel.getNews(category = newsCategory)?.observe(viewLifecycleOwner) {
            newsData.addAll(it)
            totalRequestCount += 1

            // If main fragment loaded then attach the fragment to viewPager
            if (newsCategory == Constants.GENERAL) {
                shimmerLayout.stopShimmer()
                shimmerLayout.hideShimmer()
                shimmerLayout.visibility = View.GONE
                setViewPager(view)
            }

            if (totalRequestCount == TOTAL_NEWS_TAB) {
                viewPager.offscreenPageLimit = 7
            }
        }
    }

    private fun setViewPager(view: View) {
        if (!apiRequestError) {
            viewPager.visibility = View.VISIBLE
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = Constants.newsCategories[position]
            }.attach()
        } else {
            val showError: TextView = view.findViewById(R.id.display_error)
            showError.text = errorMessage
            showError.visibility = View.VISIBLE
        }
    }

    private fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        // For 29 api or above
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val capabilities =
                connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
                    ?: return false
            return when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                else -> false
            }
        } else {
            // For below 29 api
            if (connectivityManager.activeNetworkInfo != null && connectivityManager.activeNetworkInfo!!.isConnectedOrConnecting) {
                return true
            }
        }
        return false
    }

    companion object {
        var generalNews: ArrayList<NewsModel> = ArrayList()
        var entertainmentNews: MutableList<NewsModel> = mutableListOf()
        var businessNews: MutableList<NewsModel> = mutableListOf()
        var healthNews: MutableList<NewsModel> = mutableListOf()
        var scienceNews: MutableList<NewsModel> = mutableListOf()
        var sportsNews: MutableList<NewsModel> = mutableListOf()
        var techNews: MutableList<NewsModel> = mutableListOf()
        var apiRequestError = false
        var errorMessage = "error"
    }


}