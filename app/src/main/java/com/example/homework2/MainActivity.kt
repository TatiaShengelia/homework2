package com.example.homework2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    lateinit var input:EditText
//    lateinit var output:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        input = findViewById(R.id.editTextText)
//        output = findViewById(R.id.textOutput)
    }
    @SuppressLint("SetTextI18n")
    fun buttonClick(view: View){
        var displayText: TextView = findViewById(R.id.textOutput)
        var input: EditText = findViewById(R.id.editTextText)
        val text = input.text.toString()
        if(!isValid(text)){
            displayText.setText("რიცხვი საზღვრებს გარეთაა!")
        }
        else if ((text.length == 2 && text.toInt() % 20 == 0) || text.toInt() < 20 || text.toInt() == 1000){
            displayText.setText(Numbers.getValueForNumber(text.toInt()))
        }
        else if (text.length == 2 && (text.toInt()/10)%2==0){
            displayText.setText((Numbers.getValueForNumber(text.toInt()/10*10))!!.substring(0,
                (Numbers.getValueForNumber(text.toInt()/10*10))!!.length-1) + "და" + Numbers.getValueForNumber(text.toInt()%10))
        }
        else if (text.length == 2 && (text.toInt()/10)%2==1){
            displayText.setText((Numbers.getValueForNumber((text.toInt()/10-1)*10))!!.substring(0,
                (Numbers.getValueForNumber((text.toInt()/10-1)*10))!!.length-1) + "და" + Numbers.getValueForNumber(text.toInt()%20))
        }
        else if (text.length == 3 && (text.toInt()/10)%2==0 && text.toInt()/100 ==1){
            displayText.setText(
                ("ას " + (Numbers.getValueForNumber(((text.toInt()/10)%10)*10))!!.substring(0,
                    (Numbers.getValueForNumber(((text.toInt()/10)%10)*10))!!.length-1) + "და" + Numbers.getValueForNumber(text.toInt()%10)))
        }
        else if (text.length == 3 && (text.toInt()/10)%2==1 && text.toInt()/100 ==1){
            displayText.setText(
                ("ას " + (Numbers.getValueForNumber(((text.toInt()/10)%10-1)*10))!!.substring(0,
                    (Numbers.getValueForNumber(((text.toInt()/10)%10-1)*10))!!.length-1) + "და" + Numbers.getValueForNumber(text.toInt()%20)))
        }
        else if (text.length == 3 && (text.toInt()/10)%2==0){
            displayText.setText(
                (Numbers.getValueForNumber(text.toInt()/100))!!.substring(0, Numbers.getValueForNumber(text.toInt()/100)!!.length - 1)
                    + "ას " + (Numbers.getValueForNumber(((text.toInt()/10)%10)*10))!!.substring(0,
                    (Numbers.getValueForNumber(((text.toInt()/10)%10)*10))!!.length-1) + "და" + Numbers.getValueForNumber(text.toInt()%10))
        }
        else if (text.length == 3 && (text.toInt()/10)%2==1){
            displayText.setText(
                (Numbers.getValueForNumber(text.toInt()/100))!!.substring(0, Numbers.getValueForNumber(text.toInt()/100)!!.length - 1)
                    + "ას " + (Numbers.getValueForNumber(((text.toInt()/10)%10-1)*10))!!.substring(0,
                    (Numbers.getValueForNumber(((text.toInt()/10)%10-1)*10))!!.length-1) + "და" + Numbers.getValueForNumber(text.toInt()%20))
        }
    }
    fun isValid(v:String):Boolean{
        return v.length <= 4 && v.toInt() <= 1000 && v.toInt() >= 1
    }
}