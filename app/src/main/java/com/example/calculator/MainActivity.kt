package com.example.calculator

import android.os.Bundle
import android.util.Log.d
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
var op1:Float= 0F
var op2:Float=0F
var ans:Float=0F
var op:Int=0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
            getopprend1()

    }
    fun getopprend1() {
        lis()
        B_A.setOnClickListener {
            op1=display.text.toString().toFloat()
            display.text=""
            display2.append("+")
            d("gagan","the op1:$op1")
            op=1
            d("gagan","the op:$op")
            getopprend2()
        }
        B_S.setOnClickListener {
            op1=display.text.toString().toFloat()
            display.text=""
            display2.append("-")
            d("gagan","the op1:$op1")
            op=2
            d("gagan","the op:$op")
            getopprend2()
        }
        B_M.setOnClickListener {
            op1=display.text.toString().toFloat()
            display.text=""
            display2.append("*")
            d("gagan","the op1:$op1")
            op=3
            d("gagan","the op:$op")
            getopprend2()
        }
        B_D.setOnClickListener {
            op1=display.text.toString().toFloat()
            display.text=""
            display2.append("/")
            d("gagan","the op1:$op1")
            op=4
            d("gagan","the op:$op")
            getopprend2()
        }
    }
    fun getopprend2() {
        lis()
        B_E.setOnClickListener {
            op2=display.text.toString().toFloat()
            display.text=""
            display2.append("=")
            d("gagan","the op2:$op2")
            displayans(op1,op,op2)
        }

    }
    fun lis(){
        B1.setOnClickListener {
            display.append("1")
            display2.append("1")
        }
        B2.setOnClickListener {
            display.append("2")
            display2.append("2")
        }
        B3.setOnClickListener {
            display.append("3")
            display2.append("3")
        }
        B4.setOnClickListener {
            display.append("4")
            display2.append("4")
        }
        B5.setOnClickListener {
            display.append("5")
            display2.append("5")
        }
        B6.setOnClickListener {
            display.append("6")
            display2.append("6")
        }
        B7.setOnClickListener {
            display.append("7")
            display2.append("7")
        }
        B8.setOnClickListener {
            display.append("8")
            display2.append("8")
        }
        B9.setOnClickListener {
            display.append("9")
            display2.append("9")
        }
        B0.setOnClickListener {
            display.append("0")
            display2.append("0")
        }
        B_d.setOnClickListener {
            display.append(".")
            display2.append(".")
        }
        BANS.setOnClickListener {
            display.append(ans.toString())
            display2.append(ans.toString())
        }
        B_B.setOnClickListener {
            display.text=""
        }
        B_AC.setOnClickListener {
            display.text=""
            display2.text=""
            getopprend1()
        }
    }
    fun displayans(op11:Float, opp:Int, op22:Float) {
        if(opp==1){
            display.text=""
            ans=op11+op22
            display.text=ans.toString()
            display2.append(ans.toString())
            d("gagan","the ans:$ans")
            getopprend1()

        }
        if(opp==2){
            display.text=""
            ans=op11-op22
            display.text=ans.toString()
            display2.append(ans.toString())
            d("gagan","the op2:$op2")
            getopprend1()

        }
        if(opp==3){
            display.text=""
            ans=op11*op22
            display.text=ans.toString()
            display2.append(ans.toString())
            d("gagan","the op2:$op2")
            getopprend1()

        }
        if(opp==4){
            display.text=""
            ans=op11/op22
            display.text=ans.toString()
            display2.append(ans.toString())
            d("gagan","the op2:$op2")
            getopprend1()
        }
    }
}




