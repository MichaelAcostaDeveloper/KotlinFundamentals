package com.example.kotlinfundamentals.classes

//this is an object, the word open permits to work Herencia
//this class has an argument so this is a constructor and property.Protected solo da acceso a sus clases hijas
open class Phone(protected val number:Int) {
    fun call(){//this is a function-method
        println("Llamando...")
    }
    open fun showNumber(){//this is another method that uses a parameter of constructor, the word open permits to work override
        println("Number: $number")
    }
}