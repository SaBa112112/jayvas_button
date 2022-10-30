package com.example.button1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var Button1: Button
    private lateinit var Button2: Button
    private lateinit var Button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button1 = findViewById(R.id.Button1)
        Button2 = findViewById(R.id.Button2)
        Button3 = findViewById(R.id.Button3)

        Button1.setOnClickListener { clickedView -> Toast.makeText(this, "GAUMARJOS", Toast.LENGTH_SHORT ).show()}
        Button2.setOnClickListener { clickedView -> Toast.makeText(this, "SALAMI", Toast.LENGTH_SHORT ).show()}
        Button3.setOnClickListener { clickedView -> Toast.makeText(this, "GAMARJOBA", Toast.LENGTH_SHORT ).show()}

    }
}