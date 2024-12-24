package com.btu.pandunio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.btu.movies.R
import com.squareup.picasso.Picasso

class RecyclerAdapter(val dat : List<Films>,val myFun: (Films) -> Unit): RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var vhfilms: Films? = null

        init {
            itemView.setOnClickListener {

                myFun(vhfilms!!)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val film = dat[position]
        holder.vhfilms = film

        val nameTextView = holder.itemView.findViewById<TextView>(R.id.textView)
        nameTextView.text = film.name

        val imageview = holder.itemView.findViewById<ImageView>(R.id.imageView)
        Picasso.get()
            .load(film.image)
            .into(imageview)

    }

    override fun getItemCount(): Int {
        return dat.size
    }
}
