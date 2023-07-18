package com.example.newsapp.retrofit

import com.conscent.framework.core.ConscentConfiguration
import com.example.newsapp.BuildConfig
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import okio.IOException
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    private const val BASE_URL = "https://newsapi.org/v2/"

    fun getInstance(): Retrofit {
        BuildConfig.API_KEY

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}
object RetrofitBuilder {

    private val httpClient = OkHttpClient.Builder().addInterceptor(AuthenticationInterceptor("X8GG9J7-TF7420A-HAMAGH4-2S4KPHK","Q7Z0X668AW4XP3NR2W18TNGNDXGZX8GG9J7TF7420AHAMAGH42S4KPHK"))
    private val logging = HttpLoggingInterceptor()

    private fun getRetrofit(): Retrofit {
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS)
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        if (com.conscent.plugin.BuildConfig.DEBUG) httpClient.addInterceptor(logging)

        return Retrofit.Builder()
            .baseUrl(ConscentConfiguration.getConscentUrl(ConscentConfiguration.TAG)!!)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}

class AuthenticationInterceptor(user: String, password: String) : Interceptor {

    private val credentials: String = Credentials.basic(user, password)

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val authenticatedRequest = request.newBuilder()
            .header("Authorization", credentials).build()
        return chain.proceed(authenticatedRequest)
    }

}