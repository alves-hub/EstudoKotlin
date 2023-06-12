package com.example.demo

fun main(ags: Array<String>){

    val frutas = arrayListOf<String>("Pera","Uva","Maca","abacate","laranja","banana")

   /* frutas.forEach {
        println(it)
    }*/

    ////////VOCE PODE INSERIR VARIAVEL AO INVES DE USAR O IT

    frutas.forEach {
        nomeFrutas -> println(nomeFrutas.toUpperCase())
     }



}
