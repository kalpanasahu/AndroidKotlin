package com.kt.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.kt.calculator.R
import kotlinx.android.synthetic.main.activity_calc.*


class CalcActivity :AppCompatActivity(){
    var op="*"
    var oldNumber=""
    var isNewOp=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc);
    }
    fun btnClickEvent(view:View){
        if(isNewOp){
            etShowNumber.setText("")
        }
        isNewOp=false
        val buSelect=view as Button
        var buClick:String=etShowNumber.text.toString()
        when(buSelect.id){
            btnZero.id->{
                buClick+="0"
            }
            btn1.id->{
                buClick+="1"
            }
            btn2.id->{
                buClick+="2"
            }
            btn3.id->{
                buClick+="3"
            }
            btn4.id->{
                buClick+="4"
            }
            btn5.id->{
                buClick+="5"
            }
            btn6.id->{
                buClick+="6"
            }
            btn7.id->{
                buClick+="7"
            }
            btn8.id->{
                buClick+="8"
            }
            btn9.id->{
                buClick+="9"
            }
            btnDot.id->{
                buClick+="."
            }
            btnPlusMinus.id->{
                buClick+="-"
            }

        }
        etShowNumber.setText(buClick)
    }

    fun btnOpEvent(view:View){

        val buSelect:Button=view as Button
        when(buSelect.id) {
           btnSum.id -> {
               op="+"
            }
            btnSub.id -> {
                op="-"
            }
            btnMul.id -> {
                op="*"
            }
            btnDiv.id -> {
                op="/"
            }
        }
        oldNumber=etShowNumber.text.toString()
        isNewOp=true;
    }
    fun btnEqualEvent(view:View){
        var finalValue:Double?=null
        var newNumber=etShowNumber.text.toString()
        when(op) {
          "+" -> {
               finalValue=oldNumber.toDouble()+newNumber.toDouble()
            }
            "-"-> {
                finalValue=oldNumber.toDouble()-newNumber.toDouble()
            }
            "*" -> {
                finalValue=oldNumber.toDouble() * newNumber.toDouble()
            }
            "/"-> {
                finalValue=oldNumber.toDouble()/newNumber.toDouble()
            }
        }
        etShowNumber.setText(finalValue.toString())
        isNewOp=true
    }
    fun buPercent(view :View){
        val number:Double=etShowNumber.text.toString().toDouble()/100
        etShowNumber.setText(number.toString())
    }
    fun buClean(view :View){
        etShowNumber.setText("0")
        isNewOp=true
    }
}
