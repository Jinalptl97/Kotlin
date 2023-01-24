package com.example.kotlin_practice

import android.location.GnssAntennaInfo
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


public class RecycleAdapter(
    val items: List<ItemsViewModel>): RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    private lateinit var mlistener:Myonitemclicklistener

    fun setonItemclickListener(listener: Myonitemclicklistener){
        mlistener=listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view,mlistener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = items[position]

        // sets the image to the imageview from our itemHolder class
        if (ItemsViewModel.img !== null) {
            Glide.with(holder.itemView.context)
                .load(ItemsViewModel.img)
                .override(600, 200)
                .into(holder.imageView)
        }

        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.text

    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(ItemView: View,listener: Myonitemclicklistener) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textview)

        init {
            itemView.setOnClickListener{
                listener.onclick(adapterPosition)
            }
        }


    }


    interface Myonitemclicklistener {
        fun onclick(position: Int)

    }
}