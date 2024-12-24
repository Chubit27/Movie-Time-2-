package com.btu.movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonmovies = findViewById<Button>(R.id.button_movies)
        val buttonactors = findViewById<Button>(R.id.button_actors)
        val movietime = findViewById<ImageView>(R.id.movie_time)



        buttonmovies.setOnClickListener {
            startActivity(Intent(this, Movies::class.java))
            Toast.makeText(this, "Let's go!", Toast.LENGTH_SHORT).show()
        }

        buttonactors.setOnClickListener {
            startActivity(Intent(this, Actors::class.java))
        }

        movietime.setOnClickListener {
            Snackbar.make(movietime, "Let's watch", Snackbar.LENGTH_LONG).show()
        }



    }
}