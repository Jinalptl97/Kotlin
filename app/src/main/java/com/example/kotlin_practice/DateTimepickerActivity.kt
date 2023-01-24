package com.example.kotlin_practice

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class DateTimepickerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker)
        val tv_datepicker = findViewById<TextView>(R.id.tv_datepicker)
        val tv_timepicker = findViewById<TextView>(R.id.tv_timepicker)

        val cal = Calendar.getInstance()
        val day = cal.get(Calendar.DAY_OF_MONTH)
        val my_year = cal.get(Calendar.YEAR)
        val my_month = cal.get(Calendar.MONTH)
        tv_datepicker.setOnClickListener() {
            val datpicker_dialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayofmonth ->
                    tv_datepicker.text = "Date:" + dayofmonth + "/ " + (month + 1) + "/ " + year
                },
                day,
                my_year,
                my_month
            )
            datpicker_dialog.show()
        }
        val hour = cal.get(Calendar.HOUR_OF_DAY)
        val minute = cal.get(Calendar.MINUTE)

        tv_timepicker.setOnClickListener() {
            val timepicker_dialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hoursday, minute ->
                    var am_pm=""
                    var h=0
                    if(hoursday>12){
                        h=hoursday-12
                        am_pm="PM"
                    }
                    else{
                        h=hoursday
                        am_pm="AM"
                    }

                    tv_timepicker.text = "Time :" + h + " : " + minute+" "+am_pm
                }, hour, minute, true
            )
            timepicker_dialog.show()
        }
    }
}