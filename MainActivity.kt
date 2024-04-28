package com.example.assignment22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnWoof)
        button.setOnClickListener {
            intent = Intent(this, ASSIGNMENT2A::class.java)
            startActivity(intent)
        }
    }
}