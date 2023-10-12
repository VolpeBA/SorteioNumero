package com.volpe.cursoudemy

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sortear(view: View){
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        val numero = Random.nextInt(11) // 0..10 - Formula = (n-1)
        textoResultado.setText("Número sorteado: $numero")
    }


}