package com.example.lifecycledemo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycledemo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = findViewById<EditText>(R.id.n1)
        val n2 = findViewById<EditText>(R.id.n2)
        val n3 = findViewById<EditText>(R.id.n3)
        val button = findViewById<Button>(R.id.calculate_button)

        button.setOnClickListener {
            val s1 = n1.text.toString()
            val s2 = n2.text.toString()
            val s3 = n3.text.toString()

                val m1 = s1.toFloat()
                val m2 = s2.toFloat()
                val m3 = s3.toFloat()

                val cgpa = (m1 + m2 + m3) / 30
                Toast.makeText(this, "CGPA: %.2f".format(cgpa), Toast.LENGTH_LONG).show()

        }
    }
}
