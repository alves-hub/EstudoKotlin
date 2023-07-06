package com.example.demo

fun main(args: Array<String>){

    val frutas = arrayListOf<String>("Pera","Uva","Maca","abacate","laranja","maracuja")

    for (item in frutas){
        println("$item")
    }

    // criando lista ate o 9 usando decremento de 3 posicao
    for (i in 9 downTo 0 step 3){
        println("[$i]")
    }
}

///