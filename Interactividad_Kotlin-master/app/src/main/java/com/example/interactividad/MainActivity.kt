package com.example.interactividad

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etEdad = findViewById<EditText>(R.id.etEdad)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val edad = etEdad.text.toString().trim()

            if (nombre.isEmpty() || edad.isEmpty()) {
                Toast.makeText(this, "llena todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("nombre", nombre)
                intent.putExtra("edad", edad)
                startActivity(intent)
            }
        }
    }
}

