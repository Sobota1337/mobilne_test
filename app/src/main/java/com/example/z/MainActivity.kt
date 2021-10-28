package com.example.z

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val replace = findViewById<Button>(R.id.button);
        val add = findViewById<Button>(R.id.button2);
        val suma = findViewById<Button>(R.id.button3);

        val x1 = findViewById<EditText>(R.id.editTextNumber);
        val x2 = findViewById<EditText>(R.id.editTextNumber2);

        val input = findViewById<EditText>(R.id.editTextTextPersonName);
        val output = findViewById<TextView>(R.id.textView3);


        replace.setOnClickListener {
            output.text = input.text.toString();
        }

        add.setOnClickListener() {
            output.text = output.text.toString() + input.text.toString();
        }

        suma.setOnClickListener() {
            output.text = (x1.text.toString().toDouble() + x2.text.toString().toDouble()).toString();
        }
    }

}