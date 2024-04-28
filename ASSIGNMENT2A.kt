package com.example.assignment22

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class ASSIGNMENT2A : AppCompatActivity() {

    private var petHungry = 100
    private var petClean = 50
    private var petHealth = 50

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment2)

        // Get the buttons and text views
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlayer = findViewById<Button>(R.id.btnPlay)
        val txtHungry = findViewById<EditText>(R.id.txtHungry)
        val txtClean = findViewById<EditText>(R.id.txtClean)
        val txtHealth = findViewById<EditText>(R.id.txtHealth)
        val petImage = findViewById<ImageView>(R.id.petImage)

        // Set the initial text views
        txtHungry.setText(petHungry.toString())
        txtClean.setText(petClean.toString())
        txtHealth.setText(petHealth.toString())

        //Handle button clicks
        btnFeed.setOnClickListener {
            petHungry -= 10
            petClean += 10
            petHealth += 5
            txtHungry.setText(petHungry.toString())
            animateImageChange(petImage, R.drawable.eat_eating_icon)
        }

        btnClean.setOnClickListener {
            petClean += 10
            petHealth += 10

            txtClean.setText(petClean.toString())
            animateImageChange(petImage, R.drawable.dog_cleaning_icon)
        }

        btnPlayer.setOnClickListener{
            petHealth += 10
            petHungry += 5
            txtHealth.setText(petHealth.toString())
            animateImageChange(petImage, R.drawable.hapy_dog_icon)
        }
    }

    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
        val animation = AlphaAnimation(0.0f,1.0f)
        animation.duration = 500
        animation.fillAfter = true
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)
    }
}