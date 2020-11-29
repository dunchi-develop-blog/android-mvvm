package com.dunchi.android_mvvm.viewmodel

import androidx.databinding.ObservableField

class WithoutViewModel {
    val name = ObservableField("")

    init{
        name.set("Izone")
    }

    fun nameClick() = name.set("Click")
}