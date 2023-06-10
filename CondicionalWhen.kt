package com.example.demo

fun main(args: Array<String>){
    println("INSERIR SUA IDADE:")
    val idade = readLine()?.toInt()
    // Da pra fazer com if tambem porem com when ficaria menos verboso

  /*  if(idade in 1..17){
        println("Crianca")
    }else if (idade in 18..29) {
        println("Jovem ainda!")
    }else if(idade in 30..60)
        println("Amanha velho será")*/

    when (idade){
        in 1..17 -> println("Crianca")
        in 18..29 -> println("Jovem ainda!")
        in 30..60 -> println("Velho será!")
        else -> {
            println("Pé na cova!!")
            println("Ïdoso!")
        }
    }




}