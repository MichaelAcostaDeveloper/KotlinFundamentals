package com.example.kotlinfundamentals

fun main(){
    //showPersons1("A","B","C")
    //showPersons2("A","B","C","D")

    showPersons3("a","b","c","d","e","f","g")
}

fun showPersons1(p1:String,p2:String,p3:String) {
    println(p1)
    println(p2)
    println(p3)
}

//Array of Arguments
fun showPersons2(vararg persons:String) {
    println(persons[0])
    println(persons[1])
    println(persons[2])
    println(persons[3])
}
//For loop
fun showPersons3(vararg persons:String) {
    renewTopic("For LOOP")
    for(person in persons) println(person)

    renewTopic("While LOOP")
    var index:Int = 0
    while(index<persons.size){
        println(persons[index])
        index++
    }

    renewTopic("When structure")
    var indice=(0..persons.size-1).random()
    when(persons[indice]){
        "a"->println("Es micke")
        "b"->{
            println("Debes mejorar el codigo")
        }
        "c"->println(4+6)
        "d"->println("Asi es kotlin")
        else->println("El resto de personas!!!")
    }
}

