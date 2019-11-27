package com.kt.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_detail.*

class FoodDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)
       val bundle=intent.extras
        imgViewFood.setImageResource(bundle!!.getInt("image"))
        txtViewFoodName.text=bundle!!.getString("name")
        txtViewFoodDesc.text=bundle!!.getString("desc")
    }
}
