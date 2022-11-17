package com.example.practica12

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PruebaClave : AppCompatActivity() {
    companion object{
        //clave que permite recibir un texto que mostrará en pantalla
        val EXTRA_CLAVE="Practica122.PruebaClave.nombre"
    }
    private lateinit var tvBienvenido: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_clave)
        tvBienvenido=findViewById(R.id.tvBienvenido)
        val nombre=intent.getStringExtra(EXTRA_CLAVE)
    }
}