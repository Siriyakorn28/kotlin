package com.example.assignment06_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message01 = Toast.makeText(applicationContext,"Please input all text box before pess OK. ", Toast.LENGTH_LONG)
        val clear = Toast.makeText(applicationContext,"Clear.",Toast.LENGTH_LONG)
        var ttcredit:Double
        var ttpoint:Double
        var ttGPA:Double

        bOK.setOnClickListener(){
            if (this.subj1.text.toString() == "" || this.subj2.text.toString() == "" || this.subj3.text.toString() == "" || this.subj4.text.toString() == "" ||
                    this.subj5.text.toString() == "" || this.cred1.text.toString() == "" || this.cred2.text.toString() == "" || this.cred3.text.toString() == "" ||
                    this.cred4.text.toString() == "" || this.cred5.text.toString() == "" || this.point1.text.toString() == "" || this.point2.text.toString() == "" ||
                    this.point3.text.toString() == "" || this.point4.text.toString() == "" || this.point5.text.toString() == ""){
                    message01.show()
            }else{
                val c1 = cred1.getText().toString().toDouble()
                val c2 = cred2.getText().toString().toDouble()
                val c3 = cred3.getText().toString().toDouble()
                val c4 = cred4.getText().toString().toDouble()
                val c5 = cred5.getText().toString().toDouble()
                val p1 = point1.getText().toString().toDouble()
                val p2 = point2.getText().toString().toDouble()
                val p3 = point3.getText().toString().toDouble()
                val p4 = point4.getText().toString().toDouble()
                val p5 = point5.getText().toString().toDouble()
                    ttcredit = c1 + c2 + c3 + c4 + c5
                    ttpoint = (p1 * c1) + (p2 * c2) + (p3 * c3) + (p4 * c4) + (p5 * c5)
                    ttGPA = ttpoint / ttcredit
                val GPA02 = String.format("%.2f", ttGPA);
                    total.setText("$ttcredit")
                    GPA.setText("$GPA02")
            }
        }
        bclear.setOnClickListener(){
            subj1.setText(null)
            subj2.setText(null)
            subj3.setText(null)
            subj4.setText(null)
            subj5.setText(null)
            cred1.setText(null)
            cred2.setText(null)
            cred3.setText(null)
            cred4.setText(null)
            cred5.setText(null)
            point1.setText(null)
            point2.setText(null)
            point3.setText(null)
            point4.setText(null)
            point4.setText(null)
            total.setText(null)
            GPA.setText(null)
            clear.show()
        }
    }
}