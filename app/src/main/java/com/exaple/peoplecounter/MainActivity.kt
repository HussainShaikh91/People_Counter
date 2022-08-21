package com.exaple.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIncrease = findViewById<ImageView>(R.id.btn_plus)
        val btnDecrease = findViewById<ImageView>(R.id.btn_minus)
        val textCounted = findViewById<TextView>(R.id.textCounted)
        var timesClicked = 0 //var can change and Resin & val cannot change and Resin

        btnIncrease.setOnClickListener {
            timesClicked = timesClicked + 1 //increase value
            //Set outPut on textView
            textCounted.text = timesClicked.toString()
        }
        btnDecrease.setOnClickListener {
            timesClicked = timesClicked - 1 //Decrease value
            //Set outPut on textView
            textCounted.text = timesClicked.toString()
        }

    }
}