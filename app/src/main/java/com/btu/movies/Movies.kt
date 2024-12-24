package com.btu.movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.btu.pandunio.Films
import com.btu.pandunio.RecyclerAdapter

class Movies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        val intent = Intent(this, Activity2::class.java)

        var myFun:   (Films) -> Unit   = { person ->
            intent.putExtra("name", person.name)
            intent.putExtra("image", person.image)


            startActivity(intent)
        }

        val data = listOf(
            Films("https://m.media-amazon.com/images/M/MV5BYzhiNDkyNzktNTZmYS00ZTBkLTk2MDAtM2U0YjU1MzgxZjgzXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg", "Shutter Island"),
            Films("https://m.media-amazon.com/images/I/91WY2zIvzzL._SY550_.jpg", "Mr. Robot"),
            Films("https://i.pinimg.com/originals/11/1c/5c/111c5c9ad99661af2d80e38948cf29d8.jpg","Interstellar"),
            Films("https://upload.wikimedia.org/wikipedia/en/d/dc/Into_the_Wild_%282007_film_poster%29.png","Into The Wild"),
            Films("https://m.media-amazon.com/images/M/MV5BMjA1Nzk0OTM2OF5BMl5BanBnXkFtZTgwNjU2NjEwMDE@._V1_.jpg","Her"),
            Films("https://m.media-amazon.com/images/M/MV5BZTM2NWI2OGYtYWNhMi00ZTlmLTg2ZTAtMmI5NWRjODA5YTE1XkEyXkFqcGdeQXVyODE2OTYwNTg@._V1_.jpg","Primal Fear",),
            Films("https://m.media-amazon.com/images/M/MV5BOWRiZDIxZjktMTA1NC00MDQ2LWEzMjUtMTliZmY3NjQ3ODJiXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_FMjpg_UX1000_.jpg","The Pianist"),
            Films("https://images-na.ssl-images-amazon.com/images/I/61MeTlsDRtL.jpg","Schindler's List"),
            Films("https://upload.wikimedia.org/wikipedia/en/2/26/One_Flew_Over_the_Cuckoo%27s_Nest_poster.jpg","Someone Flew Over Cuckoo's Nest",),
            Films("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg","The Shawshank Redemption")
        )

        val myRecycler = findViewById<RecyclerView>(R.id.recyclerview)
        myRecycler.layoutManager = LinearLayoutManager(this)
        myRecycler.adapter = RecyclerAdapter(data, myFun)


    }
}