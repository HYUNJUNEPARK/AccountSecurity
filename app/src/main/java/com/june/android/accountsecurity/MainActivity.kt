package com.june.android.accountsecurity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.june.android.accountsecurity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


//        setSupportActionBar(binding.toolbar)
//        supportActionBar!!.setDisplayShowTitleEnabled(false) //타이틀은 제거한다
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true) //왼쪽 버튼(홈버튼)을 사용한다
//        supportActionBar!!.setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_new_24) //왼쪽 버튼(홈버튼)에 아이콘을 설정한다

//        val fragment = supportFragmentManager.findFragmentById(R.id.main_fragment_container_view)
//        supportFragmentManager.beginTransaction().add(R.id.main_fragment_container_view, fragment!!)


        //Log.d("testLog", "onCreate: $ff")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                binding.fragmentContainerView.findNavController().popBackStack()
            }
            R.id.item_search -> {
                binding.fragmentContainerView.findNavController().navigate(R.id.action_mainFragment_to_searchFragment)
            }
            R.id.item_setting -> {
                binding.fragmentContainerView.findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
            }
        }
        return super.onOptionsItemSelected(item)
    }

//    private fun getForegroundFragment(): Fragment? {
//        val navHostFragment: Fragment? = supportFragmentManager.findFragmentById(R.id.main_fragment_container_view)
//        return navHostFragment?.childFragmentManager?.fragments?.get(0)
//    }
}