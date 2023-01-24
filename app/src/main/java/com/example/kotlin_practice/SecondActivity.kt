package com.example.kotlin_practice

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class SecondActivity : AppCompatActivity() {
    lateinit var sp:SharedPreferences
    var s: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sp=getSharedPreferences("user_data",Context.MODE_PRIVATE)
        setContentView(R.layout.activity_second)

        checkuser_scre()
        val btn: Button = findViewById(R.id.btn)
        val spinner: Spinner = findViewById(R.id.spinner)
        val tv: TextView = findViewById(R.id.tv)
        val listview: ListView = findViewById(R.id.listview)
        val et_value: EditText = findViewById(R.id.et_value)
        val btnnn: Button = findViewById(R.id.btnnn)


        val ed=sp.edit()


        btnnn.setOnClickListener{
            ed.putString("username",et_value.text.toString())
            ed.apply()
        }

        val car = listOf<String>("BMW", "AUDI", "BUGATTI")
        val arrayAdapter = ArrayAdapter(this, R.layout.item_lv, car)
        listview.adapter = arrayAdapter

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT)
                .show()

        }


//        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, car)
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner.adapter = arrayAdapter


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                s = parent?.getItemAtPosition(p2).toString()


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        btn.setOnClickListener {
            tv.text = s


        }

    }

    fun checkuser_scre(){
        if(sp.contains("username")){
            startActivity(Intent(this,AnotherActivity::class.java))
        }
        else{
            Log.e("hello","jinal")
        }
    }

}