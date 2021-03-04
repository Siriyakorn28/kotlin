package com.example.assignment06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message01 = Toast.makeText(applicationContext,"Please input num1 and num2.",Toast.LENGTH_LONG)
        val message02 = Toast.makeText(applicationContext,"Do not num2 is zero and null",Toast.LENGTH_LONG)
        val clear = Toast.makeText(applicationContext,"clear.",Toast.LENGTH_LONG)
        var ans:Double

        bplus.setOnClickListener(){
            if (this.num1.text.toString() == "" || this.num2.text.toString() == ""){
                message01.show()
            }else{
                val a = num1.getText().toString().toDouble()
                val b = num2.getText().toString().toDouble()
                sign.setText("+")
                ans = a + b
                result.setText("$ans")
            }
        }
        bminus.setOnClickListener(){
            if (this.num1.text.toString() == "" || this.num2.text.toString() == ""){
                message01.show()
            }else{
                val a = num1.getText().toString().toDouble()
                val b = num2.getText().toString().toDouble()
                sign.setText("-")
                ans = a - b
                result.setText("$ans")
            }
        }
        bmultipus.setOnClickListener(){
            if (this.num1.text.toString() == "" || this.num2.text.toString() == ""){
                message01.show()
            }else{
                val a = num1.getText().toString().toDouble()
                val b = num2.getText().toString().toDouble()
                sign.setText("*")
                ans = a * b
                result.setText("$ans")
            }
        }
        bdivider.setOnClickListener(){
            if (this.num1.text.toString() == "" || this.num2.text.toString() == ""){
                message01.show()
            }else{
                val a = num1.getText().toString().toDouble()
                val b = num2.getText().toString().toDouble()
                sign.setText("/")
                ans = a / b
                result.setText("$ans")
            }
        }
        bmodulo.setOnClickListener(){
            if (this.num2.text.toString() == "" || this.num2.text.toString() == "0"){
                message02.show()
            }else{
                val a = num1.getText().toString().toDouble()
                val b = num2.getText().toString().toDouble()
                sign.setText("%")
                ans = a % b
                result.setText("$ans")
            }
        }
        bclear.setOnClickListener(){
            num1.setText(null)
            num2.setText(null)
            result.setText(null)
            sign.setText(null)
            clear.show()
        }
    }
}