package com.example.kotlin_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_first, container, false)
        return v
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn_first: Button = view.findViewById(R.id.btn_first)
        btn_first.setOnClickListener() {
            val Bundle=Bundle()
            Bundle.putString("One","One")
            val secondFragment=SecondFragment()
            secondFragment.arguments=Bundle
            fragmentManager!!.beginTransaction().apply {
                replace(R.id.frame, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }

}