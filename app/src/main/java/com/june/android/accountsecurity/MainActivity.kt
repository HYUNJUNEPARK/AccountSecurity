package com.june.android.accountsecurity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import com.june.android.accountsecurity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        val menuSearch = menu?.findItem(R.id.item_search)
        val searchView = menuSearch?.actionView as SearchView
        searchView.setOnQueryTextListener(actionBarSearchViewQueryTextListener())
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item_menu -> {
                //TODO 메뉴 아이콘 클릭 이벤트
            }
        }
        return super.onOptionsItemSelected(item)
    }

    /**
     * 액션바 서치뷰 이벤트 리스너를 생성한다.
     */
    private fun actionBarSearchViewQueryTextListener(): SearchView.OnQueryTextListener {
        val listener = object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(textValue: String?): Boolean { //TODO 키패드 검색 버튼 클릭 이벤트

                return true
            }
            override fun onQueryTextChange(textValue: String?): Boolean { //TODO 텍스트가 변할 때 마다 호출되는 이벤트

                return true
            }
        }
        return listener
    }
}