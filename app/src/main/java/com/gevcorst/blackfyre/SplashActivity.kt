package com.gevcorst.blackfyre

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    private val splashTime = 3000L
    private lateinit var splashToMainActivityHandler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashToMainActivityHandler = Handler()
        splashToMainActivityHandler.postDelayed({goToMainActivity()},splashTime)
    }
    private fun goToMainActivity(){
        val mainActivityIntent = Intent(applicationContext,MainActivity::class.java)
        startActivity(mainActivityIntent)
        finish()
    }
}
