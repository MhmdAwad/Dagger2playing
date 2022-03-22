package com.mhmdawad.dagger2play

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BeansModule::class])
interface AppComponent {

    fun getBeans(): Beans
    fun getRiver(): River

}