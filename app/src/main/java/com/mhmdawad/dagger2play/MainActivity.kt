package com.mhmdawad.dagger2play

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CoffeeComponent = DaggerCoffeeComponent.create()
        val coffee: Coffee = component.getCoffee()


    }
}