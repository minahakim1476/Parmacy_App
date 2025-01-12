package com.example.application_3

object Constants {
    var ListOfMedicines = ArrayList<Medicine>()

    var content : Medicine ?= null
    var request : Medicine ?= null
    fun addNewMedicine(Name : String,
                       Price : Float ,
                       Dose : Int ,
                       Discount : Float ,
                       NumberInReserve : Int ,
                       NameOfActiveIngrediant : String){
        var medicine : Medicine = Medicine(Name , Price , Dose , Discount , NumberInReserve , NameOfActiveIngrediant)
        ListOfMedicines.add(medicine)
    }
}