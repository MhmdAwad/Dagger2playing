package com.mhmdawad.dagger2play

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@ActivityScope
@Subcomponent
interface CoffeeComponent {

    fun getCoffee(): Coffee
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build(): CoffeeComponent
        @BindsInstance
        fun sugar(@Named("sugar") sugar: Int): Builder
        @BindsInstance
        fun milk(@Named("milk") milk: Int): Builder

    }

}