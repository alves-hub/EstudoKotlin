package com.example.demo

fun main(args: Array<String>){

    // passando lista na declaracao do array
    val cores = arrayListOf<String>("Preto","Branco")

    //add lista apos criar array da pra fazer das duas formas
    cores.add("Cinza")
    cores.add("Prata")
    cores.add("Dourado")
    //println(cores)

    //Removendo item da lista
    cores.remove("Dourado")
    println("$cores")

    //Adicionando uma lista dentro de outra lista
    cores.addAll(arrayOf("Azul","grafite"))
    //println(cores)

    // formas para identificar o ultimo item
    val ultimoItem = cores.last()
    val ultimoIten = cores[cores.size-1]
    println("$ultimoIten")

    // Imprime um item abaixo do outro
    cores.forEach { println("$it") }




}