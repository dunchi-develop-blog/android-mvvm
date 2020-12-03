package com.dunchi.android_mvvm.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dunchi.android_mvvm.R
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinActivity : AppCompatActivity() {
    val TAG: String = this.javaClass.simpleName

    lateinit var exampleViewModel : AacViewModel

    val inject_0 by inject<InjectCountData>()
    val inject_1 by inject<InjectCountData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin)

        val androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        exampleViewModel = ViewModelProvider(this, androidViewModelFactory).get(AacViewModel::class.java)

        exampleViewModel.exampleData.observe(this, Observer {
            Log.v(TAG,">>> ${it}")
        })

        exampleViewModel.requestData()
        exampleViewModel.printHello()

        inject_0.printCount()
        inject_1.printCount()
    }
}
