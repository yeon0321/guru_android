package com.example.guruapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener
import java.util.*

class ex_diary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex_diary)

       val calendarView = findViewById<MaterialCalendarView>(R.id.calendarView)

        /*.setOnDateChangedListener(OnDateSelectedListener { eventDay ->
            val nowCalendar = eventDay.calendar
            Toast.makeText(applicationContext,
                nowCalendar.get(Calendar.YEAR).toString() + "-" +
                        (nowCalendar.get(Calendar.MONTH)+1).toString() + "-" +
                        nowCalendar.get(Calendar.DATE).toString(), Toast.LENGTH_SHORT).show()
        })*/
    }
}