package com.mar.project.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button = findViewById<Button>(R.id.button)
        val ratingScale = findViewById<TextView>(R.id.textView)

        ratingBar.setOnRatingBarChangeListener { rBar, fl, b ->
            ratingScale.text = fl.toString()
            when (rBar.rating.toInt()){

                1 -> ratingScale.text = "Very Bad"
                2 -> ratingScale.text = "Bad"
                3 -> ratingScale.text = "Good"
                4 -> ratingScale.text = "Great"
                5 -> ratingScale.text = "Awesome"
                else -> ratingScale.text = " "
            }
        }

        button.setOnClickListener {
            val message = ratingBar.rating.toString()
            Toast.makeText(
                this@MainActivity,
                "Rating is: "+message, Toast.LENGTH_SHORT
            ).show()
        }
    }
}