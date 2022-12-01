package com.example.kotlin_practice

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        val textView:TextView=findViewById(R.id.textView)

        val bundle=intent.extras
        val mystring=bundle?.getString("data")
        textView.text=mystring
    }

}