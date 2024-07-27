package com.example.newsapp.fragmentClasses

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.conscent.framework.core.ConscentWrapper
import com.conscent.models.UserDetails
//import com.example.bluepine.module.BluePine
import com.example.newsapp.LoginActivity
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentAccountTabBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class AccountTabFragment : Fragment() {
    val TAG = AccountTabFragment::class.java.simpleName

    private lateinit var binding: FragmentAccountTabBinding
    var userDetails: UserDetails? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_account_tab,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onResume() {
        super.onResume()




        binding.accountMenuNavView.setNavigationItemSelectedListener {
            when (it.groupId) {
                R.id.loyalty -> {
//                    BluePine.stateBluePine(requireContext())
                }

                R.id.logout -> {
                    lifecycleScope.launch {
                        ConscentWrapper.INSTANCE?.onSSOLogOut(
                            requireActivity(),
                            onLogOutSuccess = { message->
                                Log.i(TAG, "logoutUser: $message")
                            })
                    }

                }

                R.id.login -> {
                    lifecycleScope.launch {
                        ConscentWrapper.INSTANCE?.onSSOLogin(
                            requireActivity(),
                            onLoginSuccess = { message: String,
                                               userId: String,
                                               authToken: String ->
                                Log.d("onSSOLogin", "$message, $userId, $authToken, ")

                            })
                    }

                }

            }
            true
        }

        if (ConscentWrapper.INSTANCE?.isLoggedInSameActivity() == true) {
            binding.accountMenuNavView.menu[1].isVisible = false
        } else {
            binding.accountMenuNavView.menu[2].isVisible = false
        }

        showUserDetails()

    }

    private fun showUserDetails(): UserDetails? {
        CoroutineScope(Job()).launch {
            userDetails = ConscentWrapper.INSTANCE?.getUserDetails()
            withContext(Dispatchers.Main) {
                binding.name.text = userDetails?.phoneNumber
            }

            Log.i(TAG, "showUserDetails: $userDetails")
//            withContext(Dispatchers.Main) {
//                AlertDialog.Builder(requireContext())
//                    .setTitle("User Details")
//                    .setMessage("$userDetails")
//                    .setCancelable(true)
//                    .setPositiveButton("Ok") { dialog, _ ->
//                        dialog.dismiss()
//                    }
//                    .show()
//            }
        }
        return userDetails
    }

}