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
            "5f92a62013332e0f667794dc",
            Color.parseColor("#000000"),
            ConscentConfiguration.APP_MODE.DEBUG,
            ConscentConfiguration.MODE.STAGE,
        )

        BluePine.setPartnerIdAndUserId("98765412301", "sourav@conscent.ai")
    }
}