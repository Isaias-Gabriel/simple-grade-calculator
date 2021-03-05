package com.example.simplegradecalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = calculateButton
        val result = result

        btnCalculate.setOnClickListener {

            val grade1 = Integer.parseInt(grade1.text.toString())
            val grade2 = Integer.parseInt(grade2.text.toString())
            val absences = Integer.parseInt(absences.text.toString())

            val mean = (grade1 + grade2) / 2

            if(mean >= 8 && absences <= 4) {
                result.text = """
                                    Student passed UwU
                                    Final grade: $mean
                                    Absences: $absences
                                """.trimIndent()
                result.setTextColor(Color.GREEN)
            }

            else {
                result.text = """
                                    Student failed v_v
                                    Final grade: $mean
                                    Absences: $absences
                                """.trimIndent()
                result.setTextColor(Color.RED)
            }
        }
    }
}