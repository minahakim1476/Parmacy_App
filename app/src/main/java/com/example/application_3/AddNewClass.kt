package com.example.application_3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddNewClass : AppCompatActivity() {
    private var MedicineName_Edt : EditText ?= null
    private var MedicinePrice_Edt : EditText ?= null
    private var NumberOfDose_Edt : EditText ?= null
    private var Discount_Edt : EditText ?= null
    private var NumberInReserve_Edt : EditText ?= null
    private var NameOfActiveIngrediant_Edt : EditText ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_new_class)

        MedicineName_Edt = findViewById(R.id.Medicine_Name)
        MedicinePrice_Edt = findViewById(R.id.Medicine_Price)
        NumberOfDose_Edt = findViewById(R.id.Number_Of_Dose)
        Discount_Edt = findViewById(R.id.Discount)
        NumberInReserve_Edt = findViewById(R.id.Number_In_Reserve)
        NameOfActiveIngrediant_Edt = findViewById(R.id.Name_Of_ActiveIngrediant)


    }

    fun AddNewMedicine(view : View){
        if(MedicineName_Edt?.text!!.isEmpty() ||
            MedicinePrice_Edt?.text!!.isEmpty() ||
            NumberOfDose_Edt?.text!!.isEmpty() ||
            Discount_Edt?.text!!.isEmpty() ||
            NumberInReserve_Edt?.text!!.isEmpty() ||
            NameOfActiveIngrediant_Edt?.text!!.isEmpty()){

            Toast.makeText(this,"يجب ملئ جميع الخانات" , Toast.LENGTH_SHORT).show()
        }else{
            var MedicineName = MedicineName_Edt?.text.toString()
            var MedicinePrice = MedicinePrice_Edt?.text.toString().toFloat()
            var NumberOfDose = NumberOfDose_Edt?.text.toString().toInt()
            var Discount = Discount_Edt?.text.toString().toFloat()
            var NumberInReserve = NumberInReserve_Edt?.text.toString().toInt()
            var NameOfActiveIngrediant = NameOfActiveIngrediant_Edt?.text.toString()

            Constants.addNewMedicine(MedicineName,
                MedicinePrice,
                NumberOfDose,
                Discount,
                NumberInReserve,
                NameOfActiveIngrediant)

            Toast.makeText(this,"تم اضافة دواء" , Toast.LENGTH_SHORT).show()
            var intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun Return(view : View){
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}