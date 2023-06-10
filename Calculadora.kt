package com.example.helloword

fun main(args: Array<String>){
    // !! garante que os dados nao será nulo ? = para conversao do valor que usuário irá digita
    println("Digite o valor de X:")
    val x = readLine()?.toInt()!!
    println("Digite o valor de Y:")
    val y = readLine()?.toInt()!!
    val z = (x+y)
    println("Resultado = $z")

}