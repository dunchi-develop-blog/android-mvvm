package com.dunchi.android_mvvm.databinding

import androidx.databinding.ObservableField

class DataBindingViewModel {
    val name = ObservableField("")

    init{
        name.set("Izone")
    }

    fun nameClick() = name.set("Click")
}