package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class Onboarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val btnGoToActivity3 = findViewById<Button>(R.id.btnOnboarding2Activity)
        btnGoToActivity3.setOnClickListener { startActivity(Intent(this,Onboarding3Activity::class.java))
        }
    }
}