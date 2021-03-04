package com.example.assignment06_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ttnet:Double
        var ttinter:Double
        val clear = Toast.makeText(applicationContext,"Clear.", Toast.LENGTH_LONG)
        var year1:Double = 0.00
        var year2:Double = 0.00
        var year3:Double = 0.00
        var inter1:Double
        var inter2:Double
        var inter3:Double

        bOK.setOnClickListener(){
            val i = money.getText().toString().toDouble()
            for (j in 1..10){
                if (j >= 1 && j <= 3){
                    inter1 = i * 3 / 100
                    year1 = year1 + inter1
                    inter1 = 0.00
                    interest3.setText("$year1")
                }else if (j >= 4 && j <= 7){
                    inter2 = i * 5 / 100
                    year2 = year2 + inter2
                    inter2 = 0.00
                    interest5.setText("$year2")
                }else if (j >= 8 && j <= 10){
                    inter3 = i * 7 / 100
                    year3 = year3 + inter3
                    inter3 = 0.00
                    interest7.setText("$year3")
                }
            }
            ttinter = year1 + year2 + year3
            ttnet = i + ttinter
            interest.setText("$ttinter")
            net.setText("$ttnet")
        }
        bclear.setOnClickListener(){
            money.setText(null)
            interest3.setText(null)
            interest5.setText(null)
            interest7.setText(null)
            interest.setText(null)
            net.setText(null)
            clear.show()
        }
    }
}