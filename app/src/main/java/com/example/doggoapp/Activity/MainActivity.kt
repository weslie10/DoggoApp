package com.example.doggoapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doggoapp.Object.Dog
import com.example.doggoapp.Adapter.DogAdapter
import com.example.doggoapp.Object.DogData
import com.example.doggoapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvDog: RecyclerView
    private var list: ArrayList<Dog> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Doggo"

        rvDog = findViewById(R.id.rv_dog)
        rvDog.setHasFixedSize(true)

        list.addAll(DogData.listData)
        showRecycler()
    }

    private fun showRecycler() {
        rvDog.layoutManager = LinearLayoutManager(this)
        val listDogAdapter = DogAdapter(list)
        rvDog.adapter = listDogAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        var moveIntent: Intent? = null
        when (selectedMode) {
            R.id.action_favorite -> {
                moveIntent = Intent(this, FavoriteActivity::class.java)
            }
            R.id.action_about -> {
                moveIntent = Intent(this, About::class.java)
            }
        }
        if(moveIntent!=null)    startActivity(moveIntent)
    }
}