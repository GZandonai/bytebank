package br.com.alura.bytebank.br.com.alura.bytebank.Arrays

fun main() {

    val idades = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = Int.MIN_VALUE
    idades.forEach {idade ->
        if (idade > maiorIdade) {
            maiorIdade = idade
        }

    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}