package com.example.tde2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tde2.databinding.ActivityOpcoesBinding

class OpcoesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOpcoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOpcoesBinding.inflate(layoutInflater)

        binding.dolarParaReal.setOnClickListener {
            val intent = Intent(this, DolarParaRealActivity::class.java)
            startActivity(intent)
        }

        binding.realParaDolar.setOnClickListener {
            val intent = Intent(this, RealParaDolarActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}
