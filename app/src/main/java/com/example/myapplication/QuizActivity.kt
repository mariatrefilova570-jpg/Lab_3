package com.example.myapplication // Твой пакет

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        // Находим наши кнопки по ID
        val btnAnswer1 = findViewById<Button>(R.id.btnAnswer1)
        val btnAnswer2 = findViewById<Button>(R.id.btnAnswer2)
        val btnAnswer3 = findViewById<Button>(R.id.btnAnswer3)
        val btnAnswer4 = findViewById<Button>(R.id.btnAnswer4)

        // Настраиваем, что делать при нажатии
        btnAnswer1.setOnClickListener {
            Toast.makeText(this, "Выбран Вариант 1", Toast.LENGTH_SHORT).show()
        }
        btnAnswer2.setOnClickListener {
            Toast.makeText(this, "Выбран Вариант 2", Toast.LENGTH_SHORT).show()
        }
        btnAnswer3.setOnClickListener {
            Toast.makeText(this, "Выбран Вариант 3", Toast.LENGTH_SHORT).show()
        }
        btnAnswer4.setOnClickListener {
            Toast.makeText(this, "Выбран Вариант 4", Toast.LENGTH_SHORT).show()
        }
    }
}