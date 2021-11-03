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

        val replace = findViewById<Button>(R.id.b_replace);
        val add = findViewById<Button>(R.id.b_add);
        val suma = findViewById<Button>(R.id.b_suma);

        val x1 = findViewById<EditText>(R.id.x1);
        val x2 = findViewById<EditText>(R.id.x2);

        val input = findViewById<EditText>(R.id.i_textbox);
        val output = findViewById<TextView>(R.id.t_output);


        replace.setOnClickListener {
            output.text = input.text.toString();
        }

        add.setOnClickListener() {
            (output.text.toString() + input.text.toString()).also { output.text = it };
        }

        suma.setOnClickListener() {
            (x1.text.toString().toDouble() + x2.text.toString().toDouble()).toString()
                .also { output.text = it };
        }
    }

}