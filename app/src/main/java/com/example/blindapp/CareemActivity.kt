package com.example.blindapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class CareemActivity : AppCompatActivity() {

    private var button: ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_careem)

        button = findViewById(R.id.careem_btn) as ImageButton
        button!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                opCareem()
            }
        }
        )
    }

fun opCareem (){
    val launchIntent =
        packageManager.getLaunchIntentForPackage("com.careem.acma")
    if (launchIntent != null) {
        startActivity(launchIntent)
    } else {
        Toast.makeText(
            this@CareemActivity,
            "There is no package available in android",
            Toast.LENGTH_LONG
        ).show()
    }


}
}