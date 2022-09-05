package com.example.kotlinfundamentals.classes

class Smarthphone(number:Int,val isPrivate:Boolean):Phone(number) {
    override fun showNumber() {
        if (isPrivate){
            println("Desconocido")
        }else{
            super.showNumber()
        }
    }

}