package com.example.doggoapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.doggoapp.Object.Dog
import com.example.doggoapp.Object.DogData
import com.example.doggoapp.R

class DetailActivity : AppCompatActivity() {
    val listDog: ArrayList<Dog> = DogData.listData

    companion object {
        const val EXTRA_POSITION = "extra_position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var actionBar = getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        val detailImg: ImageView = findViewById(R.id.img_dog_detail)
        val dogBreed: TextView = findViewById(R.id.dog_breed)
        val dogHeight: TextView = findViewById(R.id.dog_height)
        val dogWeight: TextView = findViewById(R.id.dog_weight)
        val dogLife: TextView = findViewById(R.id.dog_life)
        val Detail: TextView = findViewById(R.id.detail_dog)

        val position = intent.getIntExtra(EXTRA_POSITION, 0)

        supportActionBar?.title = listDog[position].name

        detailImg.setImageResource(listDog[position].photo)
        dogBreed.text = listDog[position].breed
        dogHeight.text = listDog[position].height
        dogWeight.text = listDog[position].weight
        dogLife.text = listDog[position].life
        Detail.text = listDog[position].detail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}