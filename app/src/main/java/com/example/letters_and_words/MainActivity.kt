package com.example.letters_and_words

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.letters_and_words.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(cardFragment())
//        setupNavigation()

//        val mainActivity = this
//        binding.recyclerView.apply {
//            layoutManager = GridLayoutManager(applicationContext, 3)
//            adapter = CardAdapter(letterList)
//        }

    }

    private fun replaceFragment(cardFragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, cardFragment)
        fragmentTransaction.commit()
    }

//    private fun setupNavigation(){
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.navContainer) as NavHostFragment
//        navController = navHostFragment.navController
//        appBarConfiguration = AppBarConfiguration.Builder(navController.graph).build()
//        setupActionBarWithNavController(navController, appBarConfiguration)
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
//

}
