package com.dunchi.android_mvvm.koin

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KoinViewModel (val printService: PrintService) : ViewModel(){
    val TAG = this.javaClass.simpleName

    private val _exampleLiveData: MutableLiveData<String> = MutableLiveData()

    val exampleData: LiveData<String>
        get() = _exampleLiveData

    fun requestData() {
        val exampleData = "test"
        _exampleLiveData.value = exampleData
    }

    fun printHello() {
        printService.printHello()
    }

    override fun onCleared() {
        super.onCleared()
        Log.v(TAG, ">>> onCleared")
    }
}
