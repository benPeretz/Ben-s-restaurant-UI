package com.example.bens_restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MenuActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)



        val recyclerView =findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)

        val data=ArrayList<ItemViewModels>()

        var title= arrayOf("Beef Carpaccio","vegetable_tempura","taco_burger","streake_tartare","smoked_beef","ottoman_salad",
            "burrata")
        var description = arrayOf("Beef Tandelion, Rocket ,Parmesan Mustard, Aged Balsamic Viniger","Mix seasonal vegetable tempura",
            "Two corn tacos,Asado short Rib,Avocado,Tomato","Beef Tandelion, Mustard, Aged Balsamic Viniger And Crispy Potato",
            "Smoked Beef with Rocket,Parmesan and Virgin Olive Oil","Rocket Salad ,Beef Tomatoes,Parmaesan,Red onion")

        var images = intArrayOf(R.drawable.beef_carppacio,R.drawable.vegetable_tempura,R.drawable.taco_burger,R.drawable.streake_tartare
            ,R.drawable.smoked_beef,R.drawable.ottoman_salad)
        for (i in 0..5){
            data.add(ItemViewModels(images[i],description[i],title[i]))
        }


        val adapter =RecyclerAdapter(data)
        recyclerView.adapter=adapter








    }

}