package com.balibabu.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelectedDate:TextView? =null
    private var tvDateInHours:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSelectedDate=findViewById(R.id.tvSelectedDate)
        tvDateInHours=findViewById(R.id.tvDateInHours)
        val btnDatePicker: Button = findViewById(R.id.btnDatePicker)
        btnDatePicker.setOnClickListener {
            clickDatePicker()
        }
    }

    private fun clickDatePicker(){
        val myCalendar=Calendar.getInstance()
        val year=myCalendar.get(Calendar.YEAR)
        val month=myCalendar.get(Calendar.MONTH)
        val day=myCalendar.get(Calendar.DAY_OF_MONTH)
        val dpd=DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view,selected_y,selected_m,selected_d->
            Toast.makeText(this,"year $selected_y month ${selected_m+1} day $selected_d",Toast.LENGTH_SHORT).show()
            val selectedDate="$selected_y/${selected_m+1}/$selected_d"
            tvSelectedDate?.setText(selectedDate)

            val sdf=SimpleDateFormat("yyy/mm/dd", Locale.ENGLISH)
            val theDate=sdf.parse(selectedDate)
            val selectedDateInHours=theDate.time/3600000
            val currentDate=sdf.parse(sdf.format(System.currentTimeMillis()))
            val currentDateInHours=currentDate.time/3600000
            val diffInHours=currentDateInHours-selectedDateInHours-1
            tvDateInHours?.text = "$diffInHours"
        },year,month,day)
        dpd.datePicker.maxDate=System.currentTimeMillis()-86400000
        dpd.show()
    }
}