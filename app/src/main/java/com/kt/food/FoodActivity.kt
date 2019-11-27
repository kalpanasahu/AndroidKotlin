package com.kt.food

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_food.*
import kotlinx.android.synthetic.main.list_food.*
import kotlinx.android.synthetic.main.list_food.view.*
import java.util.zip.Inflater



class FoodActivity:AppCompatActivity(){

    private var context:Context?=null
    var foodAdapter:FoodAdapter?=null
   private val listOfFood=ArrayList<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context=this
        setContentView(R.layout.activity_food)
        //load food
               listOfFood.add(Food("French Fries","French fries,potatoes, are batonnet or allumette-cut deep-fried potatoes.",R.drawable.fingers))
        listOfFood.add(Food("Pasta","Pasta, is a type of Italian food typically made from an unleavened dough of durum wheat flour (semolina) mixed with water or eggs, and formed into sheets or various shapes, then cooked by boiling or baking.",R.drawable.pasta))
        listOfFood.add(Food("Promogrnate","The pomegranate (Punica granatum) is a fruit-bearing deciduous shrub in the family Lythraceae, subfamily Punicoideae",R.drawable.promogranate))
        listOfFood.add(Food("Tacco","Taco Bell is an American chain of fast food restaurants based in Irvine, California and a subsidiary of Yum! Brands, Inc",R.drawable.tacco))
        foodAdapter= FoodAdapter(this,listOfFood)
        gvListFood.adapter= this.foodAdapter

    }

    class FoodAdapter:BaseAdapter{
        var cxt:Context?=null
        private var lstOfFood=ArrayList<Food>()
        constructor(context:Context ,listOfFood:ArrayList<Food>):super(){
            this.cxt=context
            this.lstOfFood=listOfFood
        }
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
           var food=this.lstOfFood[p0]
            var foodView =LayoutInflater.from(cxt!!).inflate(R.layout.list_food,null)
            foodView.imgViewFood.setImageResource(food.image!!)
            foodView.txtViewFoodName.text=food.name
            foodView.imgViewFood.setOnClickListener(){
                var intent=Intent(cxt,FoodDetail::class.java)
                intent.putExtra("name",food.name!!)
                intent.putExtra("desc",food.desc!!)
                intent.putExtra("image",food.image!!)
                cxt!!.startActivity(intent)
            }
           return foodView
        }

        override fun getItem(p0: Int): Any {
            return lstOfFood[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
           return lstOfFood.size
        }

    }
}