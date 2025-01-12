package com.example.application_3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

     fun AddNewClass(view : View){
        var intent = Intent(this, AddNewClass::class.java)
         startActivity(intent)
    }

    fun ShowClasses(view : View){
        startActivity(Intent(this, AvailableMedicines::class.java))
    }

    fun requestes(view : View){
        startActivity(Intent(this,Requestes::class.java))
    }
}