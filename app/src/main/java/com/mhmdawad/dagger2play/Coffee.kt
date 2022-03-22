package com.mhmdawad.dagger2play

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/*
    Dagger create constructor injection first , field injection and in last the method injection .
    so in this sample the beans will initialized first then river and in the end call methods that injected.
 */
//constructor injection
class Coffee @Inject constructor(beans: Beans) {

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