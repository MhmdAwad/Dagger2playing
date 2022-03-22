package com.mhmdawad.dagger2play

import dagger.Module
import dagger.Provides


/*
        use module annotation when you can't add constructor injection on closed classes so
        you can create module class and and provide function where it can initialize the class to make dagger
        know where the instance of the class initialized .
 */
@Module
class CoffeeModule(val sugar: Int) {

    @Provides
    fun provideRiver(): River = River()

    @Provides
    fun provideSugar(): Int = sugar
}