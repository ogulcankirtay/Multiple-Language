package com.ogulcankirtay.multiplelanguage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnShowToast: Button
    lateinit var btnGoPage: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowToast=findViewById(R.id.button)
        btnGoPage=findViewById(R.id.buttonGo)
        btnShowToast.setOnClickListener{
            Toast.makeText(applicationContext,R.string.toast_message,Toast.LENGTH_LONG).show()

            supportActionBar!!.setDisplayShowCustomEnabled(true)
            supportActionBar!!.setLogo(R.mipmap.ic_launcher)
            supportActionBar!!.setDisplayUseLogoEnabled(true)

        }
        btnGoPage.setOnClickListener{
            val intent=Intent(this,diffrentScreenSizesActivity::class.java)
            startActivity(intent)
        }
    }
}