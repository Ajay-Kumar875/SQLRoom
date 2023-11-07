package com.example.sqlroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val lgnbtn = findViewById<Button>(R.id.Login)
        lateinit var googleicn : ImageButton
        googleicn = findViewById(R.id.googleicon)
        val signup = findViewById<TextView>(R.id.textView4)

        lgnbtn.setOnClickListener {
            val  i = Intent(applicationContext,SQLLiteExample::class.java)
            startActivity(i)
        }

    }
}