package com.example.kotlinfundamentals.classes

open class Phone(protected val number:Int) {
    fun call(){
        println("Llamando...")
    }
    open fun showNumber(){
        println("Este es mi numero: $number")
    }
}