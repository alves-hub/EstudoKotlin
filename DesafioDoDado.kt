package com.example.demo

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>){

    println("DIGITE SEU PALPITE:")
    val palpite = readLine()?.toInt()!!

    val random = java.util.Random()
    val dado = random.nextInt(6)+1 // 0-5

    when(palpite == dado) {
        true -> println("ACERTO!! SEU PALPITE FOI: $palpite E O VALOR DO DADO FOI: $dado")
        false -> println("ERROU FEIO!! SEU PALPITE FOI: $palpite E O VALOR DO DADO FOI: $dado")
    }
    // ou
    /*if(palpite == dado){
            println("ACERTO!! SEU PALPITE FOI: $palpite E O VALOR DO DADO FOI: $dado")
    }else{
            println("ERROU FEIO!! SEU PALPITE FOI: $palpite E O VALOR DO DADO FOI: $dado")
    }*/

    
}