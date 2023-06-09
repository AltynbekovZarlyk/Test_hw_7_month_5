package com.example.test_hw_7_mother_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test_hw_7_mother_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        with(binding) {
            btnPlus.setOnClickListener {
                tvResult.text = Math().add(etFirst.text.toString(), etSecond.text.toString())
            }
            btnDivide.setOnClickListener {
                tvResult.text = Math().divide(etFirst.text.toString(), etSecond.text.toString())
            }
        }
    }
}