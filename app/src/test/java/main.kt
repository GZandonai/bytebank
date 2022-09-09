package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.br.com.alura.bytebank.modelo.Endereco


fun main() {
    println("Bem vindo ao ByteBank !")
    println(" ")


    println(Any())
    println(1)
    println(1.0)
    println(true)
    println("oi")

    val endereco = Endereco(logradouro = "")


    imprime(Unit)
    imprime(1)
    imprime(1.0)
    imprime(endereco)
}

fun imprime(valor: Any) : Unit {
    println(valor)

}
