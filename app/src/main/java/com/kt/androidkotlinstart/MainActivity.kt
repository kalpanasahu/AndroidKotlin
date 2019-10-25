package com.kt.androidkotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
/*
* button call events
* */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tictoctoy)

    }

    fun btnClick(view:View){
        val btnSelected=view as Button
        var cellId=0
        when(btnSelected.id){
            R.id.btnRow11-> cellId=1
            R.id.btnRow12-> cellId=2
            R.id.btnRow13-> cellId=3
            R.id.btnRow21-> cellId=4
            R.id.btnRow22-> cellId=5
            R.id.btnRow23-> cellId=6
            R.id.btnRow31-> cellId=7
            R.id.btnRow32-> cellId=8
            R.id.btnRow33-> cellId=9

        }
        Log.d("MainActivity","btnClick "+cellId)
    }
}
