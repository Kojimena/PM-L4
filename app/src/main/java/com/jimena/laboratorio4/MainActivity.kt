package com.jimena.laboratorio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    //Declaracion de variables
    lateinit var btnToNextActivity: Button //lateinit es para que no se genere un error de que no se ha inicializado la variable
// hello
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToNextActivity = findViewById(R.id.button_MainActivity_Terminarjornada)
        initListeners()
    }
    //Inicializacion de listeners
    fun initListeners() {
        btnToNextActivity.setOnClickListener {
            val intent = android.content.Intent(this, LinearActivity::class.java)
            startActivity(intent)
        }
    }
}