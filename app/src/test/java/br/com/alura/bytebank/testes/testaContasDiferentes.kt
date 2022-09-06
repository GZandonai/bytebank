package teste

import br.com.alura.bytebank.modelo.ContaCorrente as cc
import br.com.alura.bytebank.modelo.ContaPoupanca as cp

fun testaContasDiferentes() {


    val contaCorrente = cc(
        titular = "Ana",
        numeroConta = 1234,
    )

    val contaPoupanca = cp(
        titular = "Giovanni",
        numeroConta = 4537,
    )

    contaCorrente.deposita(500.0)
    println(contaCorrente.getSaldo())
}

