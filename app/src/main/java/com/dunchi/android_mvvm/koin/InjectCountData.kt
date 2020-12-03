package com.dunchi.android_mvvm.koin

import android.util.Log

class InjectCountData {
    companion object {
        var injectCount = 0
    }

    init {
        injectCount++
    }

    fun printCount() {
        Log.v("InjectCountData","injectCount ${injectCount}")
    }
}