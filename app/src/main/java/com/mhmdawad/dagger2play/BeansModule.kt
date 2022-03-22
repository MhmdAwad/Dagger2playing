package com.mhmdawad.dagger2play

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/*
        use module annotation when you can't add constructor injection on closed classes so
        you can create module class and and provide function where it can initialize the class to make dagger
        know where the instance of the class initialized .
 */
@Module
class BeansModule {

    @Singleton
    @Provides
    fun provideBeans(): Beans = Beans()


}