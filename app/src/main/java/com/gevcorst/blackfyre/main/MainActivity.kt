package com.gevcorst.blackfyre.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gevcorst.blackfyre.databinding.ActivityMainBinding
import android.widget.Toast
import com.gevcorst.blackfyre.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        }
        catch (e: NullPointerException) {
            Toast.makeText(this,e.localizedMessage,Toast.LENGTH_LONG).show()
        }

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )
    }
}
