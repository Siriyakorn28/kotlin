package com.example.assignment03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tadd = Toast.makeText(applicationContext,"Can't add value.", Toast.LENGTH_LONG)
        val tminus = Toast.makeText(applicationContext,"Could not reduce the value.", Toast.LENGTH_LONG)
        val treset = Toast.makeText(applicationContext,"Reset number.", Toast.LENGTH_LONG)
        var number = 0

        badd.setOnClickListener(){
            if (number >= 0 && number < 9){
                number++
                text01.setText("$number")
            }else{
                tadd.show()
            }
        }
        bminus.setOnClickListener(){
            if (number > 0 && number <= 9){
                number--
                text01.setText("$number")
            }else{
                tminus.show()
            }
        }
        breset.setOnClickListener(){
            number = 0
            text01.setText("$number")
            treset.show()
        }
    }
}
