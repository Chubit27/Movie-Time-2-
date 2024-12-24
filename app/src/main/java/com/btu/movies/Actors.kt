package com.btu.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.btu.pandunio.viewpageradapter

class Actors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actors)

        val myViewPager = findViewById<ViewPager>(R.id.viewpager)
        val myAdapter = viewpageradapter(supportFragmentManager)

        myViewPager.adapter = myAdapter
    }
}