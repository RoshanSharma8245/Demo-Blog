package com.example.newsapp.utils

import android.content.SharedPreferences
import com.conscent.framework.core.ConscentWrapper

object TestingPreferences {
    private val TAG = "in.conscent.test.pref"

    private const val USER_NAME = "user name"
    private const val EMAIL = "email"
    private const val PHONE_NUMBER = "phone number"

    private val preferences: SharedPreferences by lazy {
        ConscentWrapper.Companion.getSharedPreferences()
    }

    fun setUserName(userName: String) {
        preferences.edit().putString(USER_NAME, userName).apply()
    }
    @JvmStatic
    fun getUserName(): String {
        return preferences.getString(USER_NAME, "Name") ?: "Name"
    }

    fun setEmail(email: String) {
        preferences.edit().putString(EMAIL, email).apply()
    }
    @JvmStatic
    fun getEmail(): String {
        return preferences.getString(EMAIL, "example@gmail.com") ?: "example@gmail.com"
    }

    fun setPhone(phone: String) {
        preferences.edit().putString(PHONE_NUMBER, phone).apply()
    }
    @JvmStatic
    fun getPhone(): String {
        return preferences.getString(PHONE_NUMBER, "9999999999") ?: "9999999999"
    }
}