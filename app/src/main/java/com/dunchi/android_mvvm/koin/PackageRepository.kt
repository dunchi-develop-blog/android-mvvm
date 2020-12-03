package com.dunchi.android_mvvm.koin

import android.content.Context

class PackageRepository(context: Context){
    val packageName: String

    init {
        packageName = context.packageName
    }
}