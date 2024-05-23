package com.adso.exaneb

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adso.exaneb.databinding.ActivityMainBinding
import android.view.View.OnClickListener

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main);

        val txtEdad = findViewById<EditText>(R.id.txtEdad)
        val txtPeso = findViewById<EditText>(R.id.txtPeso)

        binding.button.setOnClickListener(this)

        val Edad = txtEdad.text.toString().toFloatOrNull()
        val Peso = txtPeso.text.toString().toFloatOrNull()

        if (Edad != null && Peso != null){
            val imc = (Edad, Peso)
        }

    }
}
