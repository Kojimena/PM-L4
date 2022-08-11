package com.jimena.laboratorio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    //Declaracion de variables
    lateinit var btnToNextActivity: Button //lateinit es para que no se genere un error de que no se ha inicializado la variable
    lateinit var btnTerminarjornada: Button
    override fun onCreate(savedInstanceState: Bundle?) { //onCreate es el primer metodo que se ejecuta al iniciar la actividad
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToNextActivity = findViewById(R.id.button3)
        btnTerminarjornada= findViewById(R.id.button_MainActivity_Terminarjornada)
        initListeners()
    }
    //Inicializacion de listeners
    fun initListeners() {

        btnToNextActivity.setOnClickListener {
            Toast.makeText(this, getString(R.string.name), Toast.LENGTH_LONG).show()
        }
        btnTerminarjornada.setOnClickListener {
            Toast.makeText(this, "Jornada finalizada", Toast.LENGTH_LONG).show()
        }
    }
}