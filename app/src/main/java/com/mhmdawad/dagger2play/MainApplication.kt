package com.mhmdawad.dagger2play

import android.app.Application

class MainApplication: Application() {

    private lateinit var _coffeeComponent: CoffeeComponent
    val coffeeComponent get() = _coffeeComponent

    override fun onCreate() {
        super.onCreate()
        _coffeeComponent = DaggerCoffeeComponent.builder().sugar(3).milk(4).build()
    }

}