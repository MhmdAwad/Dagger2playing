package com.mhmdawad.dagger2play

import dagger.Component

@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {

    fun getCoffee(): Coffee
    fun inject(mainActivity: MainActivity)
}