package com.btu.pandunio

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.btu.movies.Fragment1
import com.btu.movies.Fragment2

class viewpageradapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        if(position == 0) return Fragment1()
        else return Fragment2()
    }

}