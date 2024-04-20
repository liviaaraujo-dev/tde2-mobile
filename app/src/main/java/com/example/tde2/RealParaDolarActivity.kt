package com.example.tde2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tde2.databinding.ActivityRealParaDolarBinding

class RealParaDolarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRealParaDolarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRealParaDolarBinding.inflate(layoutInflater)

        binding.converterDolarButton.setOnClickListener {
            if (binding.real.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Informe o valor!!", Toast.LENGTH_SHORT).show()
            } else {
                val real: Float = binding.real.text.toString().toFloat()
                val dolar: Double = real * 0.19;
                Toast.makeText(applicationContext, "Convertido para US$ " + dolar.toString(), Toast.LENGTH_SHORT).show()
            }
        }

        binding.voltarButton.setOnClickListener{
            startActivity(Intent(this, OpcoesActivity::class.java))
        }

        setContentView(binding.root)
    }
}