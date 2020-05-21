package com.example.loginregister

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter (private val dataArray: ArrayList<BookRow>):
        RecyclerView.Adapter<RecyclerView.Adapter.MyViewHolder>(){

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int)
            : MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.book_row, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position:Int) {
        holder.title.text = dataArray[holder.adapterPosition].title
        holder.author.text = dataArray[holder.adapterPosition].author
        holder.read.text = dataArray[holder.adapterPosition].read.toString()
    }

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val title = view.findViewById(R.id.book_title) as TextView
        val author = view.findViewById(R.id.book_author) as TextView
        val read = view.findViewById(R.id.read) as TextView
    }
}

class FilmsAdapter (private val dataArray: ArrayList<FilmRow>):
    RecyclerView.Adapter<RecyclerView.Adapter.MyViewHolder>(){

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int)
            : MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.film_row, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position:Int) {
        holder.title.text = dataArray[holder.adapterPosition].title
        holder.director.text = dataArray[holder.adapterPosition].director
        holder.watched.text = dataArray[holder.adapterPosition].watched.toString()
    }

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val title = view.findViewById(R.id.book_title) as TextView
        val director = view.findViewById(R.id.book_author) as TextView
        val watched = view.findViewById(R.id.read) as TextView
    }
}

class GamesAdapter (private val dataArray: ArrayList<FilmRow>):
    RecyclerView.Adapter<RecyclerView.Adapter.MyViewHolder>(){

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int)
            : MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.game_row, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataArray.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position:Int) {
        holder.title.text = dataArray[holder.adapterPosition].title
        holder.studio.text = dataArray[holder.adapterPosition].director
        holder.played.text = dataArray[holder.adapterPosition].watched.toString()
    }

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val title = view.findViewById(R.id.game_title) as TextView
        val studio = view.findViewById(R.id.game_studio) as TextView
        val played = view.findViewById(R.id.played) as TextView
    }
}