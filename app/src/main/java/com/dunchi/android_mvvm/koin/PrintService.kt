package com.dunchi.android_mvvm.koin

import android.util.Log

class PrintService (val packageRepository: PackageRepository) {
    fun printHello() {
        Log.v("PrintService", "Hello ${packageRepository.packageName}")
    }
}