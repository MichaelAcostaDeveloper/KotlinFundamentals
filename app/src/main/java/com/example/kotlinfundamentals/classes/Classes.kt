package com.example.kotlinfundamentals.classes

import com.example.kotlinfundamentals.renewTopic

fun main(){
    renewTopic("Clases")
    val objPhone:Phone = Phone(9247)
    objPhone.call()
    objPhone.showNumber()
    //println(objPhone.number)

    renewTopic("Herencia")
    val objSmartPhone:SmartPhone = SmartPhone(1193,true)
    objSmartPhone.call()
    objSmartPhone.showNumber();
    println("Privado? ${objSmartPhone.esPrivado}")

    renewTopic("Data classes")
    val objUser:User = User(0,"Michael","Acosta",0)
    println(objUser)
    println(objUser.group)
    println(objUser.name)
    println(objUser.lastName)
    println(objUser.group)
    println(objUser.component1())


}