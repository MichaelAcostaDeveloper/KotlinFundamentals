package com.example.kotlinfundamentals.classes

class SmartPhone(numero:Int,val esPrivado:Boolean):Phone(numero){
    override fun showNumber() {
        if(esPrivado){
            println("Desconocido por que es privado")}
        else super.showNumber()
    }
}

