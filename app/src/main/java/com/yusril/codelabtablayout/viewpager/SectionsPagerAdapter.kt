package com.yusril.codelabtablayout.viewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yusril.codelabtablayout.HomeFragment
import com.yusril.codelabtablayout.ProfileFragment

class SectionsPagerAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        // sesuai dengan banyak fragment tab
        return 3
    }

    override fun createFragment(position: Int): Fragment {
//        var fragment: Fragment? = null
//        when (position) {
//            0 -> fragment = HomeFragment()
//            1 -> fragment = ProfileFragment()
//        }
//        return fragment as Fragment
        return HomeFragment.newInstance(position + 1)
    }

}