package com.example.doggoapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doggoapp.R

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        var actionBar = getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}