package com.example.doggoapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doggoapp.Object.Dog
import com.example.doggoapp.Adapter.DogAdapter
import com.example.doggoapp.Adapter.FavoriteAdapter
import com.example.doggoapp.Object.DogData
import com.example.doggoapp.R

class FavoriteActivity : AppCompatActivity() {
    private lateinit var rvDogFav: RecyclerView
    private var list: ArrayList<Dog> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        var actionBar = getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Favorite"

        rvDogFav = findViewById(R.id.rv_dog_Fav)
        rvDogFav.setHasFixedSize(true)

        list.addAll(DogData.listFav)
        showRecycler()
    }

    private fun showRecycler() {
        rvDogFav.layoutManager = LinearLayoutManager(this)
        val listDogAdapter = FavoriteAdapter(list)
        rvDogFav.adapter = listDogAdapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}