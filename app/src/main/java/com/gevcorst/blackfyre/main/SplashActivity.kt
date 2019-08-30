package com.gevcorst.blackfyre.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.gevcorst.blackfyre.R

class SplashActivity : AppCompatActivity() {
    private val splashTime = 1000L
    private lateinit var splashToMainActivityHandler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashToMainActivityHandler = Handler()
        splashToMainActivityHandler.postDelayed({goToMainActivity()},splashTime)
    }
    private fun goToMainActivity(){
        val mainActivityIntent = Intent(applicationContext, MainActivity::class.java)
        startActivity(mainActivityIntent)
        finish()
    }
}
