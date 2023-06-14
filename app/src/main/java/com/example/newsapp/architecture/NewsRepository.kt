package com.example.newsapp.architecture

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.newsapp.NewsModel
import com.example.newsapp.retrofit.NewsDataFromJson
import com.example.newsapp.utils.Constants
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class NewsRepository {

    companion object {

        private var newsDatabase: NewsDatabase? = null

        private fun initializeDB(context: Context): NewsDatabase {
            return NewsDatabase.getDatabaseClient(context)
        }

        fun insertNews(context: Context, news: NewsModel) {

            newsDatabase = initializeDB(context)
            CoroutineScope(IO).launch {
                newsDatabase!!.newsDao().insertNews(news)
            }
        }

        fun deleteNews(context: Context, news: NewsModel) {

            newsDatabase = initializeDB(context)
            CoroutineScope(IO).launch {
                newsDatabase!!.newsDao().deleteNews(news)
            }
        }

        fun getAllNews(context: Context): LiveData<List<NewsModel>> {

            newsDatabase = initializeDB(context)
            return newsDatabase!!.newsDao().getNewsFromDatabase()
        }

    }

    // get news from API
    fun getNewsApiCall(category: String?): MutableLiveData<List<NewsModel>> {

        val newsList = MutableLiveData<List<NewsModel>>()


        val gson = Gson()
        val newsData: NewsDataFromJson? = when(category){
            Constants.GENERAL -> {
                gson.fromJson(Constants.generalNewsArticle, NewsDataFromJson::class.java)
            }

            Constants.BUSINESS -> {
                gson.fromJson(Constants.businessNewsArticle, NewsDataFromJson::class.java)
            }

            Constants.ENTERTAINMENT -> {
                gson.fromJson(Constants.entertainmentNewsArticle, NewsDataFromJson::class.java)
            }

            Constants.SCIENCE -> {
                gson.fromJson(Constants.scienceNewsArticle, NewsDataFromJson::class.java)
            }

            Constants.SPORTS -> {
                gson.fromJson(Constants.sportsNewsArticle, NewsDataFromJson::class.java)
            }
            Constants.HEALTH ->{
                gson.fromJson(Constants.healthNewsArticle, NewsDataFromJson::class.java)
            }

            Constants.TECHNOLOGY ->{
                gson.fromJson(Constants.technologyNewsArticle, NewsDataFromJson::class.java)
            }

            else -> {
                gson.fromJson(Constants.generalNewsArticle, NewsDataFromJson::class.java)
            }
        }



        if (newsData != null) {
            val tempNewsList = mutableListOf<NewsModel>()

            newsData.articles.forEach {
                tempNewsList.add(
                    NewsModel(
                        it.title,
                        it.urlToImage,
                        it.description,
                        it.url,
                        it.source.name,
                        it.publishedAt,
                        it.content
                    )
                )
            }
            newsList.value = tempNewsList
        }

        return newsList
    }

}

