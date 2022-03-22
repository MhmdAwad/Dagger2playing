package com.mhmdawad.dagger2play

import android.app.Application

class MainApplication: Application() {

    private lateinit var _appComponent: AppComponent
    val appComponent get() = _appComponent

    override fun onCreate() {
        super.onCreate()
        _appComponent = DaggerAppComponent.create()
    }

}