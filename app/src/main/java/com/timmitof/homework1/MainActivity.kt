package com.timmitof.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var buttonSend: Button

    lateinit var namef: EditText
    lateinit var surnamef: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namef = findViewById(R.id.nameIn)
        surnamef = findViewById(R.id.surnameIn)
        buttonSend = findViewById(R.id.btnSend)
        buttonSend.setOnClickListener{
            val name = namef.text.toString()
            val surname = surnamef.text.toString()

            if (name.isEmpty()){
                namef.error = "Введите имя"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            else if (surname.isEmpty()){
                surnamef.error = "Введите фамилию"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            else if (name.isBlank()){
                namef.error = "Введите имя"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            else if (surname.isBlank()){
                surnamef.error = "Введите фамилию"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (name != null && surname != null) {

                val intent = Intent(this, SecondActivity::class.java)

                intent.putExtra("NAME", name)
                intent.putExtra("SURNAME", surname)

                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i("onStart", "Старт!")
    }

    override fun onResume() {
        super.onResume()

        Log.i("onResume", "Воспроизведение!")
    }

    override fun onPause() {
        super.onPause()

        Log.i("onPause", "Пауза!")
    }

    override fun onStop() {
        super.onStop()

        Log.i("onStop", "Стоп!")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("onDestroy", "Уничтожение!")
    }
}