package com.example.application_3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AvailableMedicines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_available_medicines)

    }

    fun seeClasses(view : View){
        try{
            when(view?.id){
                R.id.First_medicine ->{
                    Constants.content = Constants.ListOfMedicines[0]
                    seeDetails()
                }
                R.id.Second_medicine ->{
                    Constants.content = Constants.ListOfMedicines[1]
                    seeDetails()
                }
                R.id.Third_medicine ->{
                    Constants.content = Constants.ListOfMedicines[2]
                    seeDetails()
                }
                R.id.Forth_medicine ->{
                    Constants.content = Constants.ListOfMedicines[3]
                    seeDetails()
                }
                R.id.Fifth_medicine ->{
                    Constants.content = Constants.ListOfMedicines[4]
                    seeDetails()
                }
                R.id.sixth_medicine ->{
                    Constants.content = Constants.ListOfMedicines[5]
                    seeDetails()
                }
            }
        }catch (e:Exception){
            Toast.makeText(this,"هذا الصنف فارغ", Toast.LENGTH_SHORT).show()
        }
    }
    fun returnToMainPage(view : View){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    fun seeDetails(){
        startActivity(Intent(this,DetailsOfMedicine::class.java))
    }
}