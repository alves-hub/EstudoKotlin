package com.example.demo

fun main () {
    var list = ConstrutorPessoa("daiany",18)

    list.altura = 1.74
    list.peso = 87.5

    var test = list.altura
    println(test)
    println(list.peso)

    list.calculoIMC()

}