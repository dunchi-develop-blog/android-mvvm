package com.dunchi.android_mvvm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with.setOnClickListener {
            startActivity(Intent(this,LiveDataActivity::class.java))
        }

        without.setOnClickListener {
            startActivity(Intent(this,DataBindingActivity::class.java))
        }
    }
}
