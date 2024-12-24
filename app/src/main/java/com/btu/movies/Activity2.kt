package com.btu.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val shemotanili = intent.getStringExtra("name")
        val foto = intent.getStringExtra("image")
        val saxeli = findViewById<TextView>(R.id.textView2)
        val image = findViewById<ImageView>(R.id.imageView2)
        saxeli.text = shemotanili
        Picasso.get()
            .load(foto)
            .into(image)
    }
}