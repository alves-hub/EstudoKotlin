package com.example.demo

fun main(args: Array<String>) {

/*
    println("DIGITE UM NUMERO:")
    val x = readLine()?.toInt()!!

    if((x % 2 ) == 0 ){
        println("O numero $x é PAR")
    }else{
        println("O numero $x é IMPAR")
    }


*/
    println("DIGITE SUA NOTA ESCOLAR:")
    val x = readLine()?.toInt()!!

    if(x == 0 && x <= 2) {
        println("Burro Burro ")
    }else if(x <= 4 ){
            println("Reprovado")

    }else if(x == 5 || x <= 7){
        println("Exame")

    }else if(x >= 8){
        println("PARABENS COM NOTA: $x VOCE FOI APROVADO ")

    } else
        println("Não sei o que pensar")

    /*
        &&	retorna verdadeiro se todas as expressões são verdadeiras	(a> b) && (a> c)
        ||	retorna verdadeiro se alguma expressão for verdadeira	(a> b) || (a> c)
        !	retornar complemento da expressão	a.not()
    */

}