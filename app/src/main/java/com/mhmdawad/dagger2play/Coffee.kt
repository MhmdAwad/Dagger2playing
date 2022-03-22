package com.mhmdawad.dagger2play

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/*
    Dagger create constructor injection first , field injection and in last the method injection .
    so in this sample the beans will initialized first then river and in the end call methods that injected.
 */
@ActivityScope /*!!
 *  user custom scope when you want to tie a class with component initialized in specific scope.
    as you can see in this sample we add activityScope in coffeeComponent that initialized into mainActivity so we called the scope
    ActivityScope because when activity well rotate it well create another instance but if we make hundreds of Coffee Class it will be
    the same because we add ActivityScope but when we delete ActivityScope from Coffee Class it will be make a new instance every time
    we want to initialize Coffee object.
 *  We made River and Beans classes with singleton scope and tied the provide them into singleton component and tied this component into
    MainApplication class because application just create one time during application process .
 *  When we want to create field injection we must add it in component with the same scope and if the class is closed we can provide it in
    a module class with module and provide annotations and of course add the same scope of component upper provide annotation.
 !!*/
//constructor injection
class Coffee @Inject constructor() {

    @Inject
    lateinit var beans: Beans
    // Field injection
    @Inject
    lateinit var river: River

    /* Method injection:
       when add inject annotation on method when dagger create an instance of this class
       he'll call the injected method without call it from outside or inside.
     */
    @Inject
    public fun runCoffeeMachine(@Named("sugar") sugar: Int){
        Log.d("TAG", "runCoffeeMachine: $sugar")
    }
}