package com.example.modul3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.modul3.databinding.ActivitySignInBinding

class SignInActivity : Activity() {

    lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener{
            var email = binding.email.text.toString()
            var password = binding.password.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()){
                startActivity(Intent(this, QuestsActivity::class.java))
            } else {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Empty fields")
                    .setPositiveButton("Ok", null)
                    .create()
                    .show()
            }
        }
    }
}