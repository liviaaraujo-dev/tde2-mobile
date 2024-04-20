package com.example.tde2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tde2.databinding.ActivityDolarParaRealBinding

class DolarParaRealActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDolarParaRealBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDolarParaRealBinding.inflate(layoutInflater)

        binding.converterRealButton.setOnClickListener {
            if (binding.dolar.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Informe o valor!!", Toast.LENGTH_SHORT).show()
            } else {
                    val dolar: Float = binding.dolar.text.toString().toFloat()
                    val real: Double = dolar * 5.21;
                    Toast.makeText(applicationContext, "Convertido para R$" + real.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        binding.voltarButton.setOnClickListener{
            startActivity(Intent(this, OpcoesActivity::class.java))
        }

        setContentView(binding.root)
    }
}
