package com.example.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
var add1 = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast_top = Toast.makeText(applicationContext, "ไม่สามารถเพิ่มค่าได้แล้ว", Toast.LENGTH_LONG)
        val toast_down = Toast.makeText(applicationContext, "ไม่สามารถเลดค่าได้แล้ว", Toast.LENGTH_LONG)



        add.setOnClickListener() {
            if (add1 <= 9) {
                add1++
                text01.setText(add1)
            }
            else{
            toast_top.show()}


        }
        minus.setOnClickListener(){
            if (add1>=0){
                add1 = add1-1
                text01.setText(add1)


            }
            else{
                toast_down.show()
            }
        }

    clear.setOnClickListener () {
        text01.setText("0")

    }
    }
}