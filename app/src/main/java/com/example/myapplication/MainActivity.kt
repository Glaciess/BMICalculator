package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<View>(R.id.Cal)
        val btn2 = findViewById<View>(R.id.RESET)


            btn.setOnClickListener(){

                if( KG.text.toString() !="" && CM.text.toString()!=""){

                val bmitotal = KG.text.toString().toDouble() / ((CM.text.toString().toDouble() / 100)*(CM.text.toString().toDouble() / 100))


 
                if(bmitotal<18.5){
                    BMIPIC.setImageResource(R.drawable.under)
                    BMI.text = "BMI : %.2f (UNDER)".format(bmitotal)
                }
                else if(bmitotal>=18.5 && bmitotal <=24.9){
                    BMIPIC.setImageResource(R.drawable.normal)
                    BMI.text = "BMI : %.2f (NORMAL)".format(bmitotal)
                }
                else if(bmitotal > 24.9){
                    BMIPIC.setImageResource(R.drawable.over)
                    BMI.text = "BMI : %.2f (Over)".format(bmitotal)
                }
            }
            }

        btn2.setOnClickListener(){


            BMI.text = ""
            KG.text.clear()
            CM.text.clear()

            BMIPIC.setImageResource(R.drawable.empty)
        }


    }


}
