package com.example.kotlinfundamentals

import kotlin.math.abs

fun main(){
    sayHello()
    //Default in kotlin we can create functions public and void
    renewTopic("Probando encapsulamiento")
    var a:Int=8
    var b:Int=-45
    var c:Int=7
    println("a + b + c = ${sum(a, b, c)}")
    println("b * c  = ${multy(b, c)}")
    println("a - c = ${substrac(a, c)}")
    println(b.enableAbs(false))
    println(b.enableAbs(true))
    showProducts("Soda","$10","15 de marzo")
    showProducts("Jamon")
    showProducts(validez= "2022", name="Jugo")
    showProducts("Torta")
}

private fun sayHello():Unit {//Unit is the way to say void in Kotlin, also this function is private, we can invocate it in this file
    println("Hello kotlin")
}

//Those functions return value:
private fun sum(a:Int, b:Int, c:Int):Int{
    return a+b+c
}

private fun multy(a:Int, b:Int):Int{
    return a.times(b)
}
private fun substrac(a:Int, b:Int) = a - b

infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this // just one parameter, no more

//Overload of methods and named arguments
fun showProducts(name:String, valor:String="No hay valor", validez:String="Hasta agotar stock"){
    println("$name = $valor y su validez es $validez" )
}