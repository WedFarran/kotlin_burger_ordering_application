package com.example.kotlinsecondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding


import android.annotation.SuppressLint
import android.widget.RadioButton
import com.example.kotlinsecondapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button.setOnClickListener{
            val checkedRadioButtonId = binding.BurgerKind.checkedRadioButtonId
            val burgerKind = findViewById<RadioButton>(checkedRadioButtonId)

            val chesse = binding.Cheese.isChecked
            val jalapeno = binding.Jalapeno.isChecked
            val tomatoes = binding.Tomatoes.isChecked

            val order = "you ordered ${burgerKind.text} burger with "+ if (chesse){"cheese "}else{""} +if (jalapeno){"jalapeno "}else{""} + if (tomatoes){"tomatoes "}else{""}

            binding.textView4.text = order
        }
    }
}