package com.example.week3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var flipcart : ImageButton
    private lateinit var google : ImageButton
    private lateinit var instagram : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flipcart = findViewById(R.id.flipcart)
        google = findViewById(R.id.google)
        instagram = findViewById(R.id.instagram)

        flipcart.setOnClickListener {
            gotoUrl("https://www.flipkart.com/account/login?ret=/")

        }

        google.setOnClickListener {
            gotoUrl("https://accounts.google.com/v3/signin/identifier?hl=en-GB&ifkv=AYZoVhc5BlvhepCNxxxpDzfIXTUtxWTqiN_-z9WB9-HERz9rungS7mRobl41EFZl360EoHbRyYtR&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1342429701%3A1694778404070352&theme=glif")
        }

        instagram.setOnClickListener {
            gotoUrl("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fonetap%2F%3Fnext%3D%252F%26__coig_login%3D1")
        }
    }

    private fun gotoUrl(s: String) {
        val i= Intent(Intent.ACTION_VIEW, Uri.parse(s))
        startActivity(i)

    }

}