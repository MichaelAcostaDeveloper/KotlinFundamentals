package com.example.kotlinfundamentals

import com.example.kotlinfundamentals.classes.Group
import com.example.kotlinfundamentals.classes.User

fun main(){
    //coleccion_just_read()
    mutable_coleccion()
}

fun coleccion_just_read(){
    renewTopic("Colecciones solo lectura en kotlin")
    val languajes= listOf("Kotlin","Java","Apex","Python","Javascript")
    val integer_numbers= listOf(4,5,6,3,6,33,9)
    println(languajes)
    println(integer_numbers)
    println(languajes.get((0..languajes.size-1).random()))
    println("Index de Python es: ${languajes.indexOf("Python")}")
}

fun mutable_coleccion(){
    var myUser: User = User(1,"Michael","Acosta", Group.FRIENDS.ordinal)
    var bro = myUser.copy(2, group = Group.FAMILY.ordinal)
    var friend = bro.copy(3,"Jose", group = Group.WORK.ordinal)

    renewTopic("Mutable List")
    val userList = mutableListOf<User>(myUser,bro)
    println(userList)
    //añadir objetos a la coleccion
    userList.add(friend)
    println(userList)
    //remover objetos de la coleccion
    userList.removeAt(0)
    userList.remove(bro)
    println(userList)
    //imprimir objeto sin data
    val userSelectedList = mutableListOf<User>()
    println(userSelectedList)
    //añadiendo varios objetos a una coleccion vacia
    userSelectedList.addAll(userList)
    println(userSelectedList)
    //añadir objeto con el indice al que se quiere insertar
    userSelectedList.set(0,bro)
    println(userSelectedList)
    //añadiendo objetos repetidos a una coleccion
    userSelectedList.add(myUser)
    userSelectedList.add(myUser)
    println(userSelectedList)
}