package com.example.blindapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.car_btn) as Button
        btn!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                opChooseActivity()
            }
        })
    }

    fun opChooseActivity() {
        val intent = Intent(this, ChooseActivity::class.java)
        startActivity(intent)
    }



    }
