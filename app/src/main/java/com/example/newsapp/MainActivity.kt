package com.example.newsapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.architecture.NewsViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    // Tabs Title


    private lateinit var viewModel: NewsViewModel


    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set Action Bar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        viewModel = ViewModelProvider(this)[NewsViewModel::class.java]


        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.labelVisibilityMode =
            NavigationBarView.LABEL_VISIBILITY_LABELED

        bottomNavigationView.setupWithNavController(findNavHostFragment(R.id.navHostFragment).navController)





    }






    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_item_mainactivity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.savednews_menu) {
            intent = Intent(applicationContext, SavedNewsActivity::class.java)
            startActivity(intent)
        }
        if (item.itemId == R.id.subscription) {
            CoroutineScope(Job()).launch {

            }
        }

        return super.onOptionsItemSelected(item)
    }





    override fun onBackPressed() {
        finishAffinity()
    }

    fun restartFragment(fragmentId: Int) {
        val currentFragment = this.supportFragmentManager.findFragmentById(fragmentId)!!

        this.supportFragmentManager.beginTransaction()
            .detach(currentFragment)
            .commit()
        this.supportFragmentManager.beginTransaction()
            .attach(currentFragment)
            .commit()
    }
}

fun FragmentActivity.findNavHostFragment(fragmentId: Int): NavHostFragment {
    return supportFragmentManager.findFragmentById(fragmentId) as NavHostFragment
}
