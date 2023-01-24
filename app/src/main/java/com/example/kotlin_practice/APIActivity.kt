package com.example.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class APIActivity : AppCompatActivity() {

    private val Base_url = ""



    private lateinit var swiperefreshlayout: SwipeRefreshLayout
    private lateinit var rcv: RecyclerView
    private var list: ArrayList<Usermodel> = ArrayList()
    private var adapter = ApiAdapter(list)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apiactivity)
        initview()
        fetchdata()
    }

    private fun fetchdata() {

    }

    private fun initview() {
        swiperefreshlayout = findViewById(R.id.swiperefresh)
        rcv = findViewById(R.id.rcv)
    }
}