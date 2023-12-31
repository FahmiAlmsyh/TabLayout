package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.example.tablayout.Adapter.SectionPageAdapter
import com.example.tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_text_home,
            R.string.tab_text_profile
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPagerAdapter = SectionPageAdapter(this)
        val viewPager2 = binding.viewPager

        viewPager2.adapter = viewPagerAdapter

        val tabs: TabLayout = binding.tabs
        TabLayoutMediator(tabs, viewPager2){tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])

        }.attach()

        supportActionBar?.elevation = 0f


    }
}