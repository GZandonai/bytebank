package teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente as cc
import br.com.alura.bytebank.modelo.ContaPoupanca as cp

fun testaContasDiferentes() {

    val giovanni = Cliente (nome ="Giovanni", cpf = "888", senha = 4537)
    val contaGiovanni = cc (titular = giovanni, numeroConta = 350)

    val ana = Cliente(nome= "Ana", cpf = "777", senha = 1234)
    val contaAna = cp(titular = ana, numeroConta = 320)

    
    println("titular da conta é  ${contaGiovanni.titular.nome}")
}



