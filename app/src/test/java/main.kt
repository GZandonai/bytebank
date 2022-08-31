fun main() {
    println("Bem vindo ao ByteBank !")
    println(" ")


    val contaCorrente = ContaCorrente(
        titular = "Giovanni",
        numeroConta = 4537
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Ana",
        numeroConta = 2715,
    )


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente {$contaCorrente}")
    println("saldo conta poupaça {$contaPoupanca}")

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)

    println("saldo conta corrente ${contaCorrente.saldo}")
    println("saldo conta poupaça ${contaPoupanca.saldo}")


}






