package com.example.modul3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.modul3.databinding.ActivitySignInBinding

class SignInActivity : Activity() {
    
    lateinit var btn: Button
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        btn = findViewById(R.id.login)

        btn.setOnClickListener{
        if (email.isNotEmpty() && password.isNotEmpty()) {
                if (checkEmail(email) == true) {
                    if (password.length >= 8 && password.length <= 20) {
                    startActivity(Intent(this, QuestsActivity::class.java))
                    } else {
                            val alert = AlertDialog.Builder(this)
                            .setTitle("Ошибка")
                            .setMessage("Пароль должен содержать не менее 8 и не более 20 символов")
                            .setPositiveButton("Ok", null)
                            .create()
                            .show()
                    }
                } else {
                    val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Неверный адрес электронной почты")
                    .setPositiveButton("Ok", null)
                    .create()
                    .show()
                }
            }  else {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Пустые поля")
                    .setPositiveButton("Ok", null)
                    .create()
                    .show()
            }
        }
    }
}
