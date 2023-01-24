package com.example.kotlin_practice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val s = arguments?.getString("One")
        Log.e("value",s.toString())
        val txt = view.findViewById<TextView>(R.id.txt)
        txt.text = s
    }
}