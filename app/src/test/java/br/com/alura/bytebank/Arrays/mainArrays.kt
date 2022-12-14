package br.com.alura.bytebank.br.com.alura.bytebank.Arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val idades = intArrayOf(25, 19, 33, 20, 55)

    var maiorIdade = Int.MIN_VALUE
    idades.forEach { idade ->
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


    var salarios = bigDecimalArrayOf("1500.55", "2000.0", "5000.00", "10000.00")
    println(salarios.contentToString())

    var aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }.toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)


    val media = salariosComAumento
        .sorted().
        takeLast(3).
        toTypedArray().
        media()
    println(media)
}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal,
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}





