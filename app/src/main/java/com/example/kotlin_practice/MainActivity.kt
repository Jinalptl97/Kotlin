package com.example.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = findViewById<TextView>(R.id.message)
        val recycleview=findViewById<RecyclerView>(R.id.recycleview)
        recycleview.layoutManager=LinearLayoutManager(this)
        message.text = "Hello world"


        Toast.makeText(this,"Hello Jinal", Toast.LENGTH_SHORT).show()
    }
}