package com.example.demo

import kotlin.math.pow

class ConstrutorPessoa constructor(nomeCompleto: String, idade:Int) {

    var altura: Double = 0.0
    var peso: Double? = null
    var imc: Double? = null
    fun calculoIMC(){
        //metodo normal
        imc = peso!! / (altura * altura)

        // utilizar metodos naivos do kotlin
        //imc = peso!!.div(altura?.pow(2))

        println("Seu indice de massa é: $imc")
    }

}
