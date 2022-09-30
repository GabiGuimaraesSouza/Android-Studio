package com.example.atividadeactivityseintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Ciclo", "OnCreate")

        val buttonNext = findViewById<Button>(R.id.button_next)
        val intentSegunda = Intent (this, SegundaActivity::class.java)
        buttonNext.setOnClickListener {
        startActivity (intentSegunda)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo", "OnDestroy")
    }

}
