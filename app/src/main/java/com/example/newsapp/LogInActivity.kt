package com.example.newsapp

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContentProviderCompat.requireContext
import com.conscent.framework.core.ConscentWrapper
import com.conscent.models.UserDetails
import com.example.newsapp.databinding.ActivityLogInBinding
import com.example.newsapp.retrofit.GenerateToken
import com.example.newsapp.retrofit.RetrofitBuilder
import com.example.newsapp.retrofit.TempAuthTokenResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginActivity : AppCompatActivity() {
    private val TAG: String = LoginActivity::class.java.simpleName

    private lateinit var binding: ActivityLogInBinding
    var userDetails:UserDetails? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val phoneRegex = Regex("^(?:\\d{10}|\\w+@\\w+\\.\\w{2,3})\$")
        var isValid = false


        binding.etUsername?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                Log.d("afterTextChanged","$s")

            }
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                Log.d("beforeTextChanged","$s")
            }
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                Log.d("onTextChanged","$s")
                isValid = s.matches(regex = phoneRegex)
                binding.login.isEnabled = isValid
                if(isValid){
                    binding.login.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.deep_sky_blue))
                }else{
                    binding.login.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.grey_white))
                }

            }
        })

        binding.login.setOnClickListener {
            autoLogin()
        }

    }

    private fun autoLogin() {
        val email = ""
        val phoneNumber = binding.etUsername?.text.toString()
        var tempToken: TempAuthTokenResponse? = null
        var message:String


        CoroutineScope(Job()).launch {
            try {
                tempToken = withContext(Dispatchers.IO) {
                    RetrofitBuilder.apiService.generateTempToken(
                        GenerateToken(
                            email,
                            phoneNumber
                        )
                    )
                }
            }catch (e:Exception){
                message = e.localizedMessage?.toString() ?: "ERROR"
            }

            Log.i(TAG, "TempToken: $tempToken")

            if (tempToken?.error != null){
                tempToken?.message.let {
                    message = it ?: tempToken?.error!!
                }
            }else{
                message = tempToken?.tempAuthToken.toString()
                val islogin = tempToken?.tempAuthToken?.let {
                    ConscentWrapper.INSTANCE?.autoLogin(
                        phoneNumber = phoneNumber,
                        clientActivity = this@LoginActivity,
                        tempToken = it
                    )
                }
            }



        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.i(TAG, "RedirectionHandler.onActivityResult: ")
        if (resultCode == RESULT_OK) {
            Toast.makeText(applicationContext,"${data?.getStringExtra("STATUS")}",Toast.LENGTH_LONG).show()
            if (data?.getStringExtra("STATUS") == "true"){
                finish()
            }
        }
    }


    private fun showLoginFailed(@StringRes errorString: Int) {
        Toast.makeText(applicationContext, errorString, Toast.LENGTH_SHORT).show()
    }

}