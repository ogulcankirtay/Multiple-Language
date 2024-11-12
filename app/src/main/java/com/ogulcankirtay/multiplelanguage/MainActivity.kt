package com.ogulcankirtay.multiplelanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnShowToast: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast=findViewById(R.id.button)
        btnShowToast.setOnClickListener{
            Toast.makeText(applicationContext,R.string.toast_message,Toast.LENGTH_LONG).show()
        }
    }
}