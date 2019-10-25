package com.kt.androidkotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_findmyage.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findmyage)
  /*    btnGetAge.setOnClickListener(View.OnClickListener {
          btnGetAgeClick()
      })*/
    }
    fun btnGetAgeClick(view:View){
        val userDOB=Integer.parseInt(etDOB.text.toString())
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        var userAgeInYear=currentYear-userDOB
        tvShowAge.text="Your Age is $userAgeInYear"
    }
}
