package com.example.bens_restaurant

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class resevation_details : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resevation_details)

        val viewDateInputRD=findViewById<TextView>(R.id.view_date_inputRD)
        val viewAmountInputRD=findViewById<TextView>(R.id.view_amount_people_inputRD)
        val viewSmokeInputRD=findViewById<TextView>(R.id.view_smoke_inputRD)

        val btnBackToResevation=findViewById<Button>(R.id.button_back_to_resevation)
        val btnConfirmResevation=findViewById<Button>(R.id.button_confirm_resevation)

        viewDateInputRD.text=intent.getStringExtra(reservation.DATE_KEY)
        viewAmountInputRD.text=intent.getStringExtra(reservation.AMOUNT_KEY)
        viewSmokeInputRD.text=intent.getStringExtra(reservation.SMOKE_KEY)

        btnBackToResevation.setOnClickListener{
            val intent=Intent(this,reservation::class.java)
            startActivity(intent)
        }
        btnConfirmResevation.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder.apply {
                setTitle("CONFIRM PURCHASE")
                setMessage("Are you sure to confirm the resevation")
                setCancelable(false)
                setPositiveButton("YES") { p0, p1 ->
                    Toast.makeText(baseContext, "your resevation is booked", Toast.LENGTH_SHORT).show()

                }
                setNegativeButton("NO") { p0, p1 ->


                }
                val dialog = builder.create()
                dialog.show()

            }
        }







    }





}