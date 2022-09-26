package com.example.kotlinfundamentals

fun main(){
    renewTopic("Colecciones solo lectura")
    val frutalist = listOf<String>("Banana","Lima","Manzana","Fresa")
    println(frutalist.get((0..frutalist.size-1).random()))
    println("El index de Manzana es: ${frutalist.indexOf("Manzana")}")
    for (fruit in frutalist){
        println("La fruta es: $fruit y el index es: ${frutalist.indexOf(fruit)}")
    }
}