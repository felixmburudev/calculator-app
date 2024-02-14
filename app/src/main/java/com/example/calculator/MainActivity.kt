package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    private lateinit var textViewDisplay: TextView
    private lateinit var buttonClear: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewDisplay = findViewById(R.id.textViewDisplay)
        buttonClear = findViewById(R.id.buttonClear)

        // Set OnClickListener for each number button
        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener {
            appendNumber(button0.text.toString())
        }

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            appendNumber(button1.text.toString())
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            appendNumber(button2.text.toString())
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            appendNumber(button3.text.toString())
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            appendNumber(button4.text.toString())
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            appendNumber(button5.text.toString())
        }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            appendNumber(button6.text.toString())
        }

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            appendNumber(button7.text.toString())
        }

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener {
            appendNumber(button8.text.toString())
        }

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            appendNumber(button9.text.toString())
        }
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            appendNumber(buttonAdd.text.toString())
        }

        val buttonSubtract: Button = findViewById(R.id.buttonSubtract)
        buttonSubtract.setOnClickListener {
            appendNumber(buttonSubtract.text.toString())
        }

        val buttonMultiply: Button = findViewById(R.id.buttonMultiply)
        buttonMultiply.setOnClickListener {
            appendNumber(buttonMultiply.text.toString())
        }

        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener {
            appendNumber(buttonDivide.text.toString())
        }

        val buttonEquals: Button = findViewById(R.id.buttonEquals)
        buttonEquals.setOnClickListener {
            calculate()
        }


        // Set OnClickListener for the clear button
        buttonClear.setOnClickListener {
            clearDisplay()
        }
    }

    private fun appendNumber(number: String) {
        val currentText = textViewDisplay.text.toString()
        val newText = if (currentText == "0") number else currentText + number
        textViewDisplay.text = newText
    }
private fun  calculate() {
        try {
            val expression = ExpressionBuilder(textViewDisplay.text.toString()).build()
            val result = expression.evaluate()
            textViewDisplay.text = result.toString()
        } catch (e: Exception) {
            textViewDisplay.text = "Error"
        }
    }
    private fun clearDisplay() {
        textViewDisplay.text = "0"
    }
}