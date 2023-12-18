package com.example.tugasbesarpemrogramanmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_detail = findViewById<Button>(R.id.btn_detail)
        btn_detail.setOnClickListener {
            startActivity(Intent(this@MainActivity, DetailTugasActivity::class.java))
        }



    }
}


