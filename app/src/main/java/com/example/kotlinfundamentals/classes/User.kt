package com.example.kotlinfundamentals.classes

//este tipo de clase con la palabra reservada data genera objetos modelados como datos para kotlin
data class User(val id:Long, var name:String, var lastname:String,var group:Int) {
}