package com.rujirakongsomran.kt_firebasecrashlytics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rujirakongsomran.kt_firebasecrashlytics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            crashNow()
        }
    }

    private fun crashNow() {
        throw RuntimeException("Test Crash") // Force a crash
    }
}