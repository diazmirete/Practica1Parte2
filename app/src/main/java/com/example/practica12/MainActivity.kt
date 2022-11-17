package com.example.practica12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etClave: EditText
    private lateinit var btAceptar: Button
    fun comprobarClave() {
        if (etClave.getText().toString().equals("1234")) {
            val intent = Intent(this, PruebaClave::class.java)
            startActivity(intent)
        } else {
            //enviamos un mensaje por pantalla
            Toast.makeText(this, getString(R.string.msj_incorrecta), Toast.LENGTH_LONG).show()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etClave=findViewById(R.id.etClave)
        btAceptar=findViewById(R.id.btAceptar)
        btAceptar.setOnClickListener{comprobarClave()}
    }
}

