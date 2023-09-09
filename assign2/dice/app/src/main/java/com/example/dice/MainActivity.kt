package com.example.dice

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var Textview : TextView
    private lateinit var Dicebutton : Button
    private lateinit var Diceimage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Textview = findViewById(R.id.TextView)
        Dicebutton = findViewById(R.id.Dicebutton)

        Dicebutton.setOnClickListener {
            rolldice()
        }
        Diceimage = findViewById(R.id.Diceimage)
    }
    private fun rolldice() {
        val random = Random()
        val randomno = random.nextInt(6) + 1
        val finaltext = "You rolled a $randomno"
        Textview.text = finaltext
        val dimage = when (randomno) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        Diceimage.setImageResource(dimage)

    }
}
