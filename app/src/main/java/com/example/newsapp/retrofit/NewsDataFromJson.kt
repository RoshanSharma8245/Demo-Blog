package com.example.newsapp.retrofit

data class NewsDataFromJson(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)

data class GenerateToken(
    var email:String = "",
    var phoneNumber:String = ""
)

data class TempAuthTokenResponse(
    var tempAuthToken:String?,
    var message:String?,
    var error:String?,
    var statusCode: Int?,
)