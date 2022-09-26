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
    val objUser1:User = User(0,"Michael","Acosta",Group.FRIEND.ordinal)
    val objUser2:User = objUser1.copy(1,"Camila")
    val objUser3:User = objUser2.copy(2, group = Group.FAMILY.ordinal)
    println(objUser1)
    println(objUser2)
    println(objUser3)

    println(objUser1.group)
    println(objUser1.name)
    println(objUser1.lastName)
    println(objUser1.group)
    println(objUser1.component1())

    renewTopic("Funciones de alcance")
    with(objSmartPhone){
        println("Es privado? $esPrivado")
        println(showNumber())
        call()
    }
    objUser3.apply{
        group = Group.FRIEND.ordinal
        name="Jose"
        lastName="Perez"
    }
    println(objUser3)
}