package com.example.newsapp

import android.app.Application
import android.graphics.Color
import com.conscent.framework.core.ConscentConfiguration
import com.conscent.framework.core.ConscentWrapper
//import com.example.bluepine.module.BluePine

class TestingApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        /***   Initialize SDK ***/

        /***  Mode can be set as :
        ConscentConfiguration.MODE.STAGE
        ConscentConfiguration.MODE.SANDBOX
        ConscentConfiguration.MODE.PRODUCTION ***/

        /***   If APP_MODE is DEBUG, then all errors will be shown as Toast messages and Logs.
        If APP_MODE is PROD, only logs will be available for critical errors like Network unavailability, wrong client_id, and wrong content_id. ***/

        ConscentWrapper.configure(
            this,
            "6336e56f047afa7cb875739e",
            Color.parseColor("#000000"),
            ConscentConfiguration.APP_MODE.DEBUG,
            ConscentConfiguration.MODE.STAGE,
        )

//        BluePine.setPartnerIdAndUserId("98765412301", "sourav@conscent.ai") // BluePine SDK need to update
    }
}