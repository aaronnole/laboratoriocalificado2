package com.nole.aaron.laboratoriocalificado02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Button

class Ejercicio01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio01)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val greenView: View = findViewById(R.id.greenView)
        val mostrarButton: Button = findViewById(R.id.btnMostrar)
        val ocultarButton: Button = findViewById(R.id.btnOcultar)
        mostrarButton.setOnClickListener {
            greenView.visibility = View.VISIBLE
        }
        ocultarButton.setOnClickListener {
            greenView.visibility = View.GONE
        }
    }
}