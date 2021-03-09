package com.example.doggoapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.doggoapp.Activity.DetailActivity
import com.example.doggoapp.Object.Dog
import com.example.doggoapp.Object.DogData
import com.example.doggoapp.R

class DogAdapter(val listDog: ArrayList<Dog>): RecyclerView.Adapter<DogAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.rv_dog_name)
        var detail: TextView = itemView.findViewById(R.id.rv_dog_detail)
        var img: ImageView = itemView.findViewById(R.id.rv_dog_img)

        var btnFavorite: ImageView = itemView.findViewById(R.id.favorite)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_dog, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val dog = listDog[position]

        Glide.with(holder.itemView.context)
            .load(dog.photo)
            .apply(RequestOptions().override(70,70))
            .into(holder.img)

        holder.name.text = dog.name
        holder.detail.text = dog.detail
        holder.btnFavorite.setOnClickListener{
            DogData.setFavorite(position)
            if(DogData.getFavorite(position)){
                holder.btnFavorite.setImageResource(R.drawable.favorite)
            }
            else{
                holder.btnFavorite.setImageResource(R.drawable.favorite_none)
            }
        }

        if(DogData.getFavorite(position)){
            holder.btnFavorite.setImageResource(R.drawable.favorite)
        }
        else{
            holder.btnFavorite.setImageResource(R.drawable.favorite_none)
        }

        holder.itemView.setOnClickListener{
            val moveIntent = Intent(holder.itemView.context, DetailActivity::class.java)
            moveIntent.putExtra("extra_position", holder.adapterPosition)
            holder.itemView.context.startActivity(moveIntent)
            Toast.makeText(holder.itemView.context, "You've just click: "+listDog[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listDog.size
    }
}