package com.example.demo

import java.util.*

fun main(args: Array<String>){
   /*
      1. Criar Array
      2. Acessar elemento
      3. ordenar
      4. Pesquisar*/

    val paises = arrayOf("Brasil","china","EUA","Marrocos")  // criando array
    val item = paises[0] // atribuindo a uma variavel
    //println(paises[3])  // exibindo array no console
    //println("$item") // exibindo item atribuido a variavel
    //val paises = Array(12,{3})

    //paises.reverse() // reverte a ordenacao da lista
    paises.sortBy { it.length } // ordenando pelo tamanho caracteres
    paises.forEach { println("$it") } // imprime a lista com todos itens do array
    val tamanho = paises.count() // tamanho

    //pesquisa por posicao
    val posicao = Arrays.binarySearch(paises,"EUA" )
    println("EUA está na posicao $posicao")

    // alterando noe do item da lista do arrays
    paises[posicao] = "eua"
    println(paises[posicao])






}