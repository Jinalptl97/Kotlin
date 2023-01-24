package com.example.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class Fragment_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
       val firstfragment=FirstFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame,firstfragment).commit()
        }
    }
}