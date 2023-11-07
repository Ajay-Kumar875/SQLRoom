package com.example.sqlroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper


class LodingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loding_page)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val  i= Intent(this,LoginPage::class.java)
                startActivity(i)
                finish()
            },3000)
    }
}