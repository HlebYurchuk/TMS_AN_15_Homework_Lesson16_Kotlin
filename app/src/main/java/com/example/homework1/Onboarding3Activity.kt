package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onboarding3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val goToLoginActivity = findViewById<Button>(R.id.btnOnboarding3Activity)
        goToLoginActivity.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}