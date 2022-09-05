package com.example.kotlinfundamentals.classes

import com.example.kotlinfundamentals.renewTopic

fun main(){
    renewTopic("Classes")
    val phone:Phone=Phone(454545)//instanciamos la clase con su constructor
    //invocamos a sus methods
    phone.call()
    phone.showNumber()
    //imprimimos sus propiedades
    //println(phone.number)

    renewTopic("Herencia")
    val smarth:Smarthphone= Smarthphone(789654,true)
    smarth.showNumber()
    println("This number is private? ${smarth.isPrivate}")
    smarth.call()

    renewTopic("Data clases")
    var myUser:User=User(7878,"Michael","Acosta",Group.FAMILY.ordinal)
    println(myUser.component1())
    println(myUser.component2())
    println(myUser.component3())
    println(myUser.component4())

    println(myUser)
    var bro=myUser.copy(2, group = Group.FAMILY.ordinal)
    var friend=bro.copy(6,"Mica", group = Group.WORK.ordinal)
    println(bro)
    println(friend)
}