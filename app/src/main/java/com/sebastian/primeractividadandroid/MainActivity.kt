package com.sebastian.primeractividadandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIngreso = findViewById<Button>(R.id.btnIngresar)
        val textName = findViewById<EditText>(R.id.TextName)
        val textPassword = findViewById<EditText>(R.id.textPassword)
        btnIngreso.setOnClickListener {
            validarCredenciales(textName, textPassword)
        }

    }

    fun validarCredenciales(textName: EditText, textPassword: EditText) {
        val credenciales = "ADMIN"
        if (textName.text.toString() == credenciales && textPassword.text.toString() == credenciales) {
            var intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("Usuario", textName.text.toString())
            startActivity(intent)
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
        }


    }

}