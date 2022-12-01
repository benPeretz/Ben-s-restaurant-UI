package com.example.bens_restaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val mList:List<ItemViewModels>) :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder{
        val view =LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val ItemViewModels=mList[position]

        holder.itemTitle.text=ItemViewModels.title
        holder.itemDescription.text=ItemViewModels.description
        holder.itemImage.setImageResource(ItemViewModels.image)
    }


    override fun getItemCount():Int{
        return mList.size
    }

    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){

        val itemImage:ImageView=itemView.findViewById(R.id.item_Image)
        val itemTitle : TextView=itemView.findViewById(R.id.item_title)
        val itemDescription : TextView=itemView.findViewById(R.id.item_description)


    }
}