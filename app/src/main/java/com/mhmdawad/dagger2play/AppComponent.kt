package com.mhmdawad.dagger2play

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BeansModule::class])
interface AppComponent {

    fun coffeeComponentBuilder(): CoffeeComponent.Builder/*
    When we use main dependency in application class to make singleton scope every time child component need a singleton class
    from main component the main component should add a function that return an instance of the selected class so that make a boiler blat code
    so we have a new way that a subcomponent just add the subcomponent onto the child component and add a return function in the main component
    and with easily way you can create instance from any class in main component without any returned function.
    */

}