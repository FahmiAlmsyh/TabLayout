package com.example.tablayout.Adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayout.HomeFragment
import com.example.tablayout.ProfileFragment

class SectionPageAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment  : Fragment? = null

        when(position) {
            0 -> fragment = HomeFragment()
            1 ->  fragment = ProfileFragment()
        }

        return fragment as Fragment

    }
}
