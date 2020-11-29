package com.dunchi.android_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dunchi.android_mvvm.databinding.ActivityWithoutAacBinding
import com.dunchi.android_mvvm.viewmodel.WithoutViewModel

class WithoutAAC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_without_aac)

        val binding: ActivityWithoutAacBinding = DataBindingUtil.setContentView(this, R.layout.activity_without_aac)
        binding.vm = WithoutViewModel()
    }
}
