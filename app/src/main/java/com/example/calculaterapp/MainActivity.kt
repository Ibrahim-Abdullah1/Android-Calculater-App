package com.example.calculaterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var num1EDV:EditText?=null
    var num2EDV:EditText?=null
    var restxtv:TextView?=null
    var num1=0
    var num2=0
    fun ValidateNums():Boolean {
        num1 = Integer.parseInt(num1EDV?.text.toString())
        num2 = Integer.parseInt(num2EDV?.text.toString())
        return true
    }
    fun CalculateSum(view: View):Unit{
        Toast.makeText(this,"Adding Numbers", Toast.LENGTH_SHORT).show()
        val sum=num1+num2
        restxtv?.setText(Integer.toString(sum))

    }
    fun CalculateProduct(view: View):Unit{
        Toast.makeText(this,"Multiplying Numbers",Toast.LENGTH_SHORT).show()
        restxtv?.text=(num1*num2).toString()
    }
    fun CalculateSubtract(view: View):Unit{
        Toast.makeText(this,"Subtracting Numbers",Toast.LENGTH_SHORT).show()
        restxtv?.text=(num1-num2).toString()

    }
    fun CalculateDivision(view: View):Unit{
        Toast.makeText(this,"Dividing Numbers",Toast.LENGTH_SHORT).show()

//        t1.setText(Integer.toString(sum));
    }
    fun calculateRemainder(view: View):Unit{
        Toast.makeText(this,"Remainder of Numbers",Toast.LENGTH_SHORT).show()
        restxtv?.text=(num1%num2).toString()
    }
//    fun calculatePower(view: View){
//        restxtv?.text=(Math.pow(num1.toDouble(),num2.toDouble())).toString()
//    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        num1EDV=findViewById<EditText>(R.id.tv1)
        num2EDV=findViewById<EditText>(R.id.tv2)
        restxtv=findViewById(R.id.textView)
    }


}