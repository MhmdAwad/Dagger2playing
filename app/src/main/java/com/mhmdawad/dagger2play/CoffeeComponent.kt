package com.mhmdawad.dagger2play

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {

    fun getCoffee(): Coffee
    fun inject(mainActivity: MainActivity)



    @Component.Builder
    interface Builder{
        fun build(): CoffeeComponent
        @BindsInstance
        fun sugar(@Named("sugar") sugar: Int): Builder
        @BindsInstance
        fun milk(@Named("milk") milk: Int): Builder

    }

}