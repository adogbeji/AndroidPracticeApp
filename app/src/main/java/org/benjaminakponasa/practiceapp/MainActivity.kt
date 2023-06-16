package org.benjaminakponasa.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var resultOutput: TextView? = null
    var lastNumeric: Boolean = false
    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultOutput = findViewById(R.id.resultOutput)
    }

    fun onDigit(view: View) {
//        Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()

        resultOutput?.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }

    fun onClear(view: View) {
        resultOutput?.text = ""
    }

    fun onDecimalPoint(view: View) {
        if (lastNumeric && !lastDot) {
            resultOutput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}