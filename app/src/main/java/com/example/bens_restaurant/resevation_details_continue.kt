package com.example.bens_restaurant

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.ReportFragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.bens_restaurant.databinding.ActivityMainBinding
import com.example.bens_restaurant.databinding.ActivityResevationDetailsContinueBinding

var numOfMargarita=0
var numOfSunsetSoda=0
var numOfStami=0
var numOfcheese=0
var numOfFries=0
var numOfMushroom=0
class resevation_details_continue : AppCompatActivity() {



    //private lateinit var navController :NavController
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding=ActivityResevationDetailsContinueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(R.layout.activity_resevation_details_continue)

        var flagappetizers=false
        var flagdrinks=true
        var flagFinish=false

        binding.viewDateInputRDC.text=intent.getStringExtra(reservation.DATE_KEY)
        binding.viewAmountPeopleInputRDC.text=intent.getStringExtra(reservation.AMOUNT_KEY)
        binding.viewSmokeInputRDC.text=intent.getStringExtra(reservation.SMOKE_KEY)

        binding.buttonAppetizersFragment.setOnClickListener{
            if(flagappetizers!=true&&flagFinish!=true) {
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_drinks_fragment_to_appetizers_fragments3)
            flagappetizers=true
                flagdrinks=false
            }


        }

        binding.buttonDrinksFragment.setOnClickListener{
            if(flagdrinks!=true&&flagFinish!=true) {
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_appetizers_fragments3_to_drinks_fragment)
                flagappetizers=false
                flagdrinks=true
            }
        }
        /*
        binding.buttonFinishOrder.setOnClickListener{
            flagFinish=true
            if(flagdrinks==true)
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_drinks_fragment_to_sumUp_fragment)
            else if(flagappetizers==true)
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_appetizers_fragments3_to_sumUp_fragment)

        }

         */
        binding.buttonFinishOrder.setOnClickListener{
        val builder:AlertDialog.Builder=AlertDialog.Builder(this)
        builder.apply {
            setTitle("Confirm Purchase")
            setMessage("Are you sure to booked this resevation ?")
            setCancelable(false)
            setPositiveButton("yes") { p0, p1 ->

            flagFinish=true
            if(flagdrinks==true)
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_drinks_fragment_to_sumUp_fragment)
            else if(flagappetizers==true)
                findNavController(R.id.nav_host_fragment).navigate(R.id.action_appetizers_fragments3_to_sumUp_fragment)
            Toast.makeText(baseContext, "your resevation is booked", Toast.LENGTH_SHORT).show()
            }

            setNegativeButton("no") { p0, p1 ->


            }
            val dialog=builder.create()
            dialog.show()
        }

        }

}}