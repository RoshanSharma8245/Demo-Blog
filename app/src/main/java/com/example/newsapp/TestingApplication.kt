package com.example.newsapp

import android.app.Application
import android.graphics.Color
import com.conscent.framework.core.ConscentConfiguration
import com.conscent.framework.core.ConscentWrapper
import com.example.bluepine.module.BluePine

class TestingApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ConscentWrapper.configure(
            this,
            "6336e56f047afa7cb875739e",
            Color.parseColor("#000000"),
            ConscentConfiguration.APP_MODE.DEBUG,
            ConscentConfiguration.MODE.STAGE,
        )

        BluePine.setPartnerIdAndUserId("98765412301", "sourav@conscent.ai")
    }
}