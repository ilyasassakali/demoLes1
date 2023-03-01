package com.example.hooglaag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class GameActivity : AppCompatActivity() {

    private var currentNumber = 0
    private var score =  0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val higherButton = findViewById<Button>(R.id.higherButton)
        val equalButton = findViewById<Button>(R.id.equalButton)
        val lowerButton = findViewById<Button>(R.id.lowerButton)
        val currentNumberTextView = findViewById<TextView>(R.id.currentNumberTextView)
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)

        currentNumber = generateRandomNumber()
        //ici on a un randomnumber

        currentNumberTextView.text = currentNumber.toString()

        higherButton.setOnClickListener {
            val newNumber = -()
            if (newNumber > currentNumber) {
                score++
            } else {
                score = 0
            }
            currentNumber = newNumber
            currentNumberTextView.text = currentNumber.toString()
            scoreTextView.text = score.toString()
        }

        lowerButton.setOnClickListener {
            val newNumber = generateRandomNumber()
            if (newNumber < currentNumber) {
                score++
            } else {
                score = 0
            }
            currentNumber = newNumber
            currentNumberTextView.text = currentNumber.toString()
            scoreTextView.text = score.toString()
        }

        equalButton.setOnClickListener {
            val newNumber = generateRandomNumber()
            if (newNumber == currentNumber) {
                score++
            } else {
                score = 0
            }
            currentNumber = newNumber
            currentNumberTextView.text = currentNumber.toString()
            scoreTextView.text = score.toString()

        }

    }
    private fun generateRandomNumber(): Int {
        return (1..12).random()
    }


}


