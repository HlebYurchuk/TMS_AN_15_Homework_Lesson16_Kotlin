package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import java.util.concurrent.TimeUnit

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val goToRegistrationActivity = findViewById<Button>(R.id.btnLoginActivity)
        goToRegistrationActivity.setOnClickListener {
            startActivity(Intent(this,RegistrationActivity::class.java))
        }
    }
}