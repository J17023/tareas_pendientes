package com.example.proyecto_basico

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val duration: Int = Toast.LENGTH_SHORT
        val editar_texto: EditText = findViewById(R.id.Editar_texto)
        val boton_presion:Button = findViewById(R.id.Presionar)



        boton_presion.setOnClickListener{
            val texto_toast = editar_texto.text.toString()

            if(texto_toast.isEmpty()){
                Toast.makeText(this,"No se coloco texto",duration).show()
            }else{
                Toast.makeText(this,texto_toast,duration).show()
            }

        }
    }
}