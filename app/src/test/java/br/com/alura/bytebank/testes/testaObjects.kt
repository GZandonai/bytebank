package br.com.alura.bytebank.modelo.br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaObjects() {
    val giovanni = Cliente(nome = "Giovanni", cpf = "888", senha = 4537)

    val contaPoupanca = ContaPoupanca(titular = giovanni, numeroConta = 15)

    val ana = object {
        val nome: String = "Ana"
        val cpf: String = "777"
        val senha: Int = 123
        fun autentica(senha: Int) = this.senha == senha
    }


    println("nome do cliente ${ana.nome}")

    println("total de contas: ${Conta.total}")
}