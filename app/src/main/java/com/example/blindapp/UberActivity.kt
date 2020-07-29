package com.example.blindapp

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class UberActivity : AppCompatActivity() {

    private var button: ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_uber)

        button = findViewById(R.id.uber_btn) as ImageButton
        button!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
            opUber()
            }

        })}


   fun opUber() {
        val launchIntent =
            packageManager.getLaunchIntentForPackage("com.ubercab")
        if (launchIntent != null) {
            startActivity(launchIntent)
        } else {
            Toast.makeText(
                this@UberActivity,
                "There is no package available in android",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}




