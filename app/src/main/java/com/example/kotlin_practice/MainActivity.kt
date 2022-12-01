package com.example.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = findViewById<TextView>(R.id.message)
        val recycleview = findViewById<RecyclerView>(R.id.recycleview)
        recycleview.layoutManager = LinearLayoutManager(this)
        message.text = "Hello world"

        val data = ArrayList<ItemsViewModel>()
        val media = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"


        for (i in 1..20) {
            data.add(ItemsViewModel(media, "Item-" + i))
        }
        val adapter = RecycleAdapter(data)
        recycleview.adapter = adapter


        Toast.makeText(this, "Hello Jinal", Toast.LENGTH_SHORT).show()
    }
}