package com.dunchi.android_mvvm.koin

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject

class AacViewModel : ViewModel(),
    KoinComponent {
    val TAG = this.javaClass.simpleName

    private val _exampleLiveData: MutableLiveData<String> = MutableLiveData()

    val printService: PrintService by inject()

    val exampleData: LiveData<String>
        get() = _exampleLiveData

    fun requestData() {
        val exampleData = "example"

        _exampleLiveData.value = exampleData
    }

    override fun onCleared() {
        super.onCleared()
        Log.v(TAG, ">>> onCleared")
    }

    fun printHello() {
        printService.printHello()
    }
}