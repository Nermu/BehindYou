package com.example.blindapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ChooseActivity : AppCompatActivity() {

    private var btn: ImageButton? = null
    var btn2: ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        btn = findViewById(R.id.uber_btn) as ImageButton
        btn2 = findViewById(R.id.careem_btn) as ImageButton
        btn!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                opUberActivity()

            }
        })

        btn2!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                opCareemActivity()

            }
        })


    }

    private fun opCareemActivity() {
        val intent = Intent(this, CareemActivity::class.java)
        startActivity(intent)
    }

    fun opUberActivity() {
        val intent = Intent(this, UberActivity::class.java)
        startActivity(intent)
    }
}
