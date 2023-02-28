package com.example.demoles1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonClickMe : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById<Button>(R.id.buttonOne);
        val texthello : TextView = findViewById(R.id.hellotext);

        buttonClickMe.setOnClickListener{
            texthello.text = getString(R.string.you_clicked_me)
        }
    }
    private fun changeButtonText(){
        buttonClickMe.text = "suuu";
    }
}