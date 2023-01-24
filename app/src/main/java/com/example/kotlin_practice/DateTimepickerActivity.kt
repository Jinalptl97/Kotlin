package com.example.kotlin_practice

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class DatepickerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker)
        val tv_datepicker = findViewById<TextView>(R.id.tv_datepicker)
        val cal = Calendar.getInstance()
        val day = cal.get(Calendar.DAY_OF_MONTH)
        val my_year = cal.get(Calendar.YEAR)
        val my_month = cal.get(Calendar.MONTH)
        tv_datepicker.setOnClickListener() {
            val datpicker_dialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayofmonth ->
                    tv_datepicker.text="Date:"+ dayofmonth+"/ "+(month+1)+"/ "+year
                },
                day,
                my_year,
                my_month
            )
            datpicker_dialog.show()
        }
    }
}