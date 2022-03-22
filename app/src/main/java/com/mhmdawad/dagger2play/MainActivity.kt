package com.mhmdawad.dagger2play


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add value in run time if you want a value from user.
        val component: CoffeeComponent = DaggerCoffeeComponent.builder().sugar(3).milk(4).build()
        component.inject(this)



    }
}