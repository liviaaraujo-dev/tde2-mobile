package com.example.tde2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tde2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener(){
            var user = "livia"
            var password="123"

            var userText: String = binding.user.text.toString()
            var passwordText: String = binding.password.text.toString()

            if(userText.isEmpty() || passwordText.isEmpty()){
                Toast.makeText(applicationContext, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }else{
                if(user == userText && passwordText == password){
                    startActivity(Intent(this, OpcoesActivity::class.java))
                }else{
                    Toast.makeText(applicationContext, "Incorreto", Toast.LENGTH_SHORT).show()
                }
            }

        }


        super.onCreate(savedInstanceState)
    }
}
