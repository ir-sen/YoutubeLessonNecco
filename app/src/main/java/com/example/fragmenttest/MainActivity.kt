package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.palce_holder, BlankFragment.newInstance()).commit()

        binding.nfBtn.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.palce_holder, BlankFragment2.newInstance()).commit()
        }
    }
}