package com.example.bens_restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bens_restaurant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding //במקום findbyID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonReservation.setOnClickListener{

        val intent =Intent(this,reservation::class.java)
        startActivity(intent)


        }
        binding.buttonMenu.setOnClickListener{
            val intent =Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }




    }
}