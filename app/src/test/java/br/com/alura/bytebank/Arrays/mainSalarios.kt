package br.com.alura.bytebank.br.com.alura.bytebank.Arrays

fun main (){

    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0,10000.0)


    val aumento = 1.1
    var indice = 0

    for(indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento

    }
    print(salarios.contentToString())

    salarios.forEachIndexed() { i, salario ->
        salarios[i] = salario * aumento

    }
    println(salarios.contentToString()
    )
}