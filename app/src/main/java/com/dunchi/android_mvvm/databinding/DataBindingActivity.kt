package com.dunchi.android_mvvm.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dunchi.android_mvvm.R

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDataBindingBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_data_binding
        )
        binding.vm = DataBindingViewModel()
    }
}