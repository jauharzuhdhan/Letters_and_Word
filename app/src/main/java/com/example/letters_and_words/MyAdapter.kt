package com.example.letters_and_words

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val letterList : ArrayList<Letters>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.letter_list,
        parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = letterList[position]
        holder.tvLetter.text = currentItem.letter
    }

    override fun getItemCount(): Int {
        return letterList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tvLetter : TextView = itemView.findViewById(R.id.tvLetter)
    }


}