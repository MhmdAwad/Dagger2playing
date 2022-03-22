package com.mhmdawad.dagger2play


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee
    @Inject
    lateinit var coffee2: Coffee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add value in run time if you want a value from user.
        val component: AppComponent = (application as MainApplication).appComponent

        val coffeeComponent = component.coffeeComponentBuilder().milk(2).sugar(2).build()
        coffeeComponent.inject(this)

        println(">>>>>>>>>>>> $coffee === ${coffee.beans} === ${coffee.river} ")
        println(">>>>>>>>>>>> $coffee2 === ${coffee2.beans} === ${coffee2.river} ")



    }
}