package com.dunchi.android_mvvm.koin

import android.app.Application
import com.dunchi.android_mvvm.R
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@KoinApplication)
            modules(myModule)
//            modules(myModule, myViewModel)
        }

    }
}

val myViewModel = module {
    viewModel {
        KoinViewModel(get())
    }
}

val myModule = module {
    single {
        PackageRepository(androidContext())
    }

    single {
        PrintService(get())
    }

    factory {
        InjectCountData()
    }
}