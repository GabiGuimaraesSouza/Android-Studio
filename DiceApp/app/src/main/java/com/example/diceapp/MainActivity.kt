package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)


        buttonD6.setOnClickListener {
            Toast.makeText(this, "Botão Clicado", Toast.LENGTH_LONG).show()
            rolardados(6)
        }

        buttonD12.setOnClickListener {
            Toast.makeText(this, "Botão Clicado", Toast.LENGTH_LONG).show()
            rolardados(12)
        }

        buttonD20.setOnClickListener {
            Toast.makeText(this, "Botão Clicado", Toast.LENGTH_LONG).show()
            rolardados(20)
        }
    }
    private fun rolardados(ladoss: Int) {

        val rolagem = ( 1..ladoss).random()

        val textdadoss = findViewById<TextView>(R.id.textView)

        textdadoss.text = rolagem.toString()


    }
}

