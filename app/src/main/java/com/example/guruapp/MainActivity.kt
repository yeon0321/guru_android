package com.example.guruapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

open class MainActivity : AppCompatActivity() {

    lateinit var preEx_body: Button
    lateinit var preEx_upperbody: Button
    lateinit var preEx_lowerbody: Button
    lateinit var preEx_stretch: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prepare_ex)

        preEx_body = findViewById(R.id.preEx_body)
        preEx_upperbody = findViewById(R.id.preEx_upperbody)
        preEx_lowerbody = findViewById(R.id.preEx_lowerbody)
        preEx_stretch = findViewById(R.id.preEx_stretch)


        preEx_body.setOnClickListener({
            val intent_body = Intent(this, prepare_ex_body::class.java)
            startActivity(intent_body)
        })


        preEx_lowerbody.setOnClickListener({
            val intent_lowerbody = Intent(this, prepare_ex_lowerbody::class.java)
            startActivity(intent_lowerbody)
        })

        preEx_upperbody.setOnClickListener({
            val intent_upperbody = Intent(this, prepare_ex_upperbody::class.java)
            startActivity(intent_upperbody)
        })

        preEx_stretch.setOnClickListener({
            val intent_stretch = Intent(this, prepare_ex_stretching::class.java)
            startActivity(intent_stretch)
        })

    }









}