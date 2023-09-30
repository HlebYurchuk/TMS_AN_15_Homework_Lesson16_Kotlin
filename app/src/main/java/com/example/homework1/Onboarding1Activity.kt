package com.example.homework1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Onboarding1Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val btnGoToOnboarding2 = findViewById<Button>(R.id.btnOnboarding1Activity)
        btnGoToOnboarding2.setOnClickListener{ startActivity(Intent(this,Onboarding2Activity::class.java))
        }
    }
}