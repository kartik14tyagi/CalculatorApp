package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btAdd.setOnClickListener {
            val input1 = binding.it1.text.toString().toInt()
            val input2 = binding.it2.text.toString().toInt()

            binding.tresult.text = (input1+input2).toString()
        }
        binding.btSubtract.setOnClickListener {
            val input1 = binding.it1.text.toString().toInt()
            val input2 = binding.it2.text.toString().toInt()

            binding.tresult.text = (input1-input2).toString()
        }
        binding.btMultiply.setOnClickListener {
            val input1 = binding.it1.text.toString().toInt()
            val input2 = binding.it2.text.toString().toInt()

            binding.tresult.text = (input1*input2).toString()
        }
        binding.btDivide.setOnClickListener {
            val input1 = binding.it1.text.toString().toInt()
            val input2 = binding.it2.text.toString().toInt()

            binding.tresult.text = (input1/input2).toString()
        }
    }
}