package com.example.bens_restaurant

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.AlertDialog.Builder
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import com.example.bens_restaurant.databinding.ActivityMainBinding
import java.util.*

class reservation : AppCompatActivity() {

    companion object{
        const val DATE_KEY="date"
        const val AMOUNT_KEY="amount"
        const val SMOKE_KEY="key"

    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)


        val dateView=findViewById<TextView>(R.id.dateView)
        val btnPicker= findViewById<Button>(R.id.btnPicker)

        val btnAdd1=findViewById<Button>(R.id.button_add1)
        val btnMin1=findViewById<Button>(R.id.button_min1)
        val viewAmountPeople=findViewById<TextView>(R.id.viewAmountPeople)
        var amountOfPeople=0

        val btnSwitcherSmoke=findViewById<Switch>(R.id.switch_smoke)
        var flagSwitchSmoke=false

        val btnFinishOrder=findViewById<Button>(R.id.button_finish_order)
        val btnCountinueReservation=findViewById<Button>(R.id.button_countinue_reservation)

        val c= Calendar.getInstance()
        var year=c.get(Calendar.YEAR)
        var month=c.get(Calendar.MONTH)
        var day=c.get(Calendar.DAY_OF_MONTH)


        btnPicker.setOnClickListener{
            val dpd=DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view,year,month,day->

                dateView.text= day.toString()+"/"+month.toString()+"/"+year.toString()
            },year,month,day)
            dpd.datePicker.minDate=System.currentTimeMillis()-1000

            dpd.show()

        }

        btnAdd1.setOnClickListener{

            amountOfPeople++
            viewAmountPeople.text=amountOfPeople.toString()
        }
        btnMin1.setOnClickListener{
            if(amountOfPeople>0){
                amountOfPeople--
                viewAmountPeople.text=amountOfPeople.toString()
            }
        }

        btnSwitcherSmoke.setOnCheckedChangeListener { compoundButton, b ->
            if (b==true){
                Toast.makeText(baseContext, "smoke area", Toast.LENGTH_SHORT).show()
                flagSwitchSmoke=true
            }
            else{
                Toast.makeText(baseContext, "not smoke area", Toast.LENGTH_SHORT).show()
                flagSwitchSmoke=false
            }
        }


        btnFinishOrder.setOnClickListener{
            if(amountOfPeople==0){
                Toast.makeText(baseContext, "amount of poeple can't be 0", Toast.LENGTH_SHORT).show()

            }
            else {


                val intent = Intent(this, resevation_details::class.java)
                intent.putExtra(
                    DATE_KEY,
                    year.toString() + "/" + month.toString() + "/" + day.toString()
                )
                intent.putExtra(AMOUNT_KEY, amountOfPeople.toString())
                if (flagSwitchSmoke) {
                    intent.putExtra(SMOKE_KEY, "yes")
                } else {
                    intent.putExtra(SMOKE_KEY, "no")
                }

                startActivity(intent)
            }
        }

        btnCountinueReservation.setOnClickListener{
            if(amountOfPeople==0){
                Toast.makeText(baseContext, "amount of poeple can't be 0", Toast.LENGTH_SHORT).show()

            }
            else {
                val intent = Intent(this, resevation_details_continue::class.java)
                intent.putExtra(
                    DATE_KEY,
                    day.toString() + "/" + month.toString() + "/" + year.toString()
                )
                intent.putExtra(AMOUNT_KEY, amountOfPeople.toString())
                if (flagSwitchSmoke) {
                    intent.putExtra(SMOKE_KEY, "yes")
                } else {
                    intent.putExtra(SMOKE_KEY, "no")
                }

                startActivity(intent)
            }
        }









    }
}