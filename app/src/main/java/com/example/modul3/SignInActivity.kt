package com.example.modul3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.modul3.databinding.ActivitySignInBinding

class SignInActivity : Activity() {

    //lateinit var binding: ActivitySignInBinding
    lateinit var btn: Button
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivitySignInBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.activity_sign_in)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        btn = findViewById(R.id.login)

        btn.setOnClickListener{
            if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
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

       /* binding.login.setOnClickListener{
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
        }*/
    }
}