package com.example.kotlinfundamentals

import kotlin.reflect.typeOf

//constantes globales
const val separator = "=================="
fun main(){
    //print("Hola kotlin")
    //newTopic("hOLA AMIGOS")
    renewTopic("Hello Kotlin")
    //variables_constants
    nulldata_anydata()


}

fun newTopic(topic:String){
    println()
    print("==================== ")
    print(topic)
    print(" ====================")
    println()
}

fun renewTopic(renew: String){
    print("\n$separator $renew $separator\n")
}

fun variables_constants(){

    renewTopic("Variables y Constantes")
    val a = 3
    val b = "Numbers"
    val c = false
    println("The constants are: $a , $b, $c")

    //When you create a variables is necessary put the type, otherwise the system detect the first type of value
    var x:Int=45
    var y:String="I am coding"
    var z:Boolean=true
    println("The variables we have are: $x, $y, $z")
}

fun nulldata_anydata(){
    renewTopic("Null values and any values")
    //In kotlin we do not have null variables
    var obj1:String
    obj1= null.toString()

    //if a variable could be a null it is necessary to put ?
    var obj2:String?
    obj2=null

    //if a variable can take whatever value, we have to put Any
    var obj3:Any
    obj3=23

    println("The values are: $obj1, $obj2, $obj3")

}