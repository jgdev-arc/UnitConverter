package com.tlz.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etKilo: EditText = findViewById(R.id.etKilo)
        val button: Button = findViewById(R.id.btnConvert)
        val resultText: TextView = findViewById(R.id.resultText)

        button.setOnClickListener {
            val kilos: Double = etKilo.text.toString().toDouble()

            resultText.setText("" + convertToPounds(kilos) + "\nPounds")
        }


    }

    fun convertToPounds(kilos: Double): Double {

        return kilos * 2.20462
    }

}