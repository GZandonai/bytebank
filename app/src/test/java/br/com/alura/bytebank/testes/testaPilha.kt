package br.com.alura.bytebank.br.com.alura.bytebank.testes

import br.com.alura.bytebank.br.com.alura.bytebank.exception.SaldoInsuficienteException

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pega")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any ()
        throw SaldoInsuficienteException()



    }
    println("fim funcao2")
}
