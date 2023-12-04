package com.example.listcontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listcontacts.databinding.ActivityContactBinding
import com.example.listcontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.switchPhoneContacts.setOnClickListener {

            if (binding.switchRandomContacts.isChecked)
                binding.switchRandomContacts.isChecked = false
        }


        binding.switchRandomContacts.setOnClickListener {
            if (binding.switchPhoneContacts.isChecked)
                binding.switchPhoneContacts.isChecked = false
        }


    }
}