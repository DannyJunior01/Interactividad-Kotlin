package com.example.interactividad

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvBienvenida = findViewById<TextView>(R.id.tvBienvenida)
        val tvDatos = findViewById<TextView>(R.id.tvDatos)
        val btnAbrirGoogle = findViewById<Button>(R.id.btnAbrirGoogle)

        val nombre = intent.getStringExtra("nombre")
        val edad = intent.getStringExtra("edad")

        tvBienvenida.text = "hola, $nombre"
        tvDatos.text = "tu edad es: $edad años"

        btnAbrirGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }
    }
}