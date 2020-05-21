package com.example.loginregister

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter( ) /*private val dataArray: ArrayList<DataBaseRow>):
    RecyclerView.Adapter<RecyclerView.Adapter.MyViewHolder>() {

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int ) : MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate (R.layout.dbrow, parent, false )
        return MyViewHolder(view)
    }

    override fun getItemCount (): Int { return dataArray.size}
    override fun onBindViewHolder( holder: MyViewHolder, position: Int ) {
        holder.markaTextView.text = dataArray[ holder.adapterPosition ].marka
        holder.modelTextView.text = dataArray [ holder.adapterPosition ].model
        holder.rokTextView.text = dataArray [ holder . adapterPosition ].rokProdukcji.toString()
    }

    inner class MyViewHolder(view: View ): RecyclerView.ViewHolder(view) {
        val markaTextView = view.findViewById(R.id.markaTextView) as TextView
        val modelTextView = view.findViewById(R.id.modelTextView) as TextView
        val rokTextView = view.findViewById(R.id.rokTextView) as TextView } */