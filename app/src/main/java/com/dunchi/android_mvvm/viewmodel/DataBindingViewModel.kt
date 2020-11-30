package com.dunchi.android_mvvm.viewmodel

import androidx.databinding.ObservableField

class DataBindingViewModel {
    val name = ObservableField("")

    init{
        name.set("Izone")
    }

    fun nameClick() = name.set("Click")
}