package com.example.demo

fun main(args: Array<String>){

    val resultado = somar(10,25)
    println(resultado)
    val resultads = subtracao(10,25)
    println(resultads)
    val result = divisao(25,25)
    println(result)
    val resul= multplicacao(25,25)
    println(resul)

}

fun somar(x: Int, y: Int) : Int{
    val resultado = x+y
    return resultado
}
//Forma mais simples sem passar o tipo de parametro  esperado
fun subtracao(x: Int, y: Int) = x-y
fun divisao(x: Int, y: Int) :Int = x/y
fun multplicacao(x: Int, y: Int) :Int{
    val resultado = x*y
    return resultado
}