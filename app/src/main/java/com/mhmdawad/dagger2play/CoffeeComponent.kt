package com.mhmdawad.dagger2play

import dagger.Component

@Component
interface CoffeeComponent {

    fun getCoffee(): Coffee
    fun inject(mainActivity: MainActivity)
}