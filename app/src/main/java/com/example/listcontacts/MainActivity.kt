package com.example.listcontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listcontacts.databinding.ActivityContactBinding
import com.example.listcontacts.databinding.ActivityMainBinding
import com.example.listcontacts.shared.Shared
import com.example.listcontacts.shared.SharedService

class MainActivity : AppCompatActivity() {

    private var shared : Shared? = null

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shared = Shared(this)


        binding.btnStart.setOnClickListener {
            if (binding.switchRandomContacts.isChecked || binding.switchPhoneContacts.isChecked){
                shared?.saveData(binding.switchPhoneContacts.isChecked.toString(),"switch_phone")
                shared?.saveData(binding.switchRandomContacts.isChecked.toString(),"switch_random")
                startActivity(Intent(this@MainActivity,ContactAct::class.java))
            }

            else
                Toast.makeText(this,"nothing is selected",Toast.LENGTH_SHORT).show()
        }


        binding.switchPhoneContacts.setOnClickListener {

            if (binding.switchRandomContacts.isChecked){
                binding.switchRandomContacts.isChecked = false

            }
        }


        binding.switchRandomContacts.setOnClickListener {
            if (binding.switchPhoneContacts.isChecked){
                binding.switchPhoneContacts.isChecked = false
            }

        }


    }
}