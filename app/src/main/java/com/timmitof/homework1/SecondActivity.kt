package com.timmitof.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var textName: TextView
    lateinit var backButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textName = findViewById(R.id.tvName)
        backButton = findViewById(R.id.backBtn)
        val name = intent.getStringExtra("NAME")
        val surname = intent.getStringExtra("SURNAME")

        textName.text = "$name $surname"
        backButton.setOnClickListener {
            onBackPressed()
        }

    }
}