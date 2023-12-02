package com.example.modul3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var linearLayout: View = findViewById(R.id.LinearLayout)
        linearLayout.alpha = 0f
        linearLayout.animate().setDuration(1000).alpha(1f).withEndAction {
            startActivity(Intent(this@SplashActivity, SignInActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}