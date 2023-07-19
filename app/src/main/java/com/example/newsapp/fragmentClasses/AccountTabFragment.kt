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
import com.conscent.framework.core.ConscentWrapper
import com.conscent.models.UserDetails
import com.example.bluepine.module.BluePine
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
    var userDetails:UserDetails? = null

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
                R.id.loyalty ->{
                    BluePine.stateBluePine(requireContext())
                }
                R.id.logout ->{
                    logoutUser()
                }
                R.id.login ->{
                    val intent = Intent(requireContext(),LoginActivity::class.java)
                    startActivity(intent)
                }

            }
            true
        }

        if (ConscentWrapper.INSTANCE?.isLoggedIn() == true) {
            binding.accountMenuNavView.menu[1].isVisible = false
        }else{
            binding.accountMenuNavView.menu[2].isVisible = false
        }

        showUserDetails()

    }

    private fun logoutUser() {
        CoroutineScope(Job()).launch {
            val logoutResponse = ConscentWrapper.INSTANCE?.logoutUser()
            Log.i(TAG, "logoutUser: $logoutResponse")
            withContext(Dispatchers.Main) {
                AlertDialog.Builder(requireContext())
                    .setTitle("Logout")
                    .setMessage(logoutResponse?.message)
                    .setCancelable(true)
                    .setPositiveButton("Ok") { dialog, _ ->
                        requireActivity().recreate()
                        dialog.dismiss()
                    }
                    .show()
            }
        }
    }

    private fun showUserDetails():UserDetails? {
        CoroutineScope(Job()).launch {
            userDetails = ConscentWrapper.INSTANCE?.getUserDetails()
            withContext(Dispatchers.Main){
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