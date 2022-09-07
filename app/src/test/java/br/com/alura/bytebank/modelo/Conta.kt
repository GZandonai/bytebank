package br.com.alura.bytebank.modelo


open class Conta(
    val titular: Cliente,
    val numeroConta: Int,

    ) {
    companion object  {

        var total = 0
            private set
    }

    private var saldo: Double = 0.0
    fun getSaldo() = saldo


    init {
        println("Criando conta")
        total++
    }


    //Deposita
    fun deposita(valor: Double) {
        if (valor > 0.0) {
            println("Deposito feito com sucesso!")
        } else {
            println("Não é possivel depositar esse valor")
        }
    }

    //Saca
    fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    //Transfere
    fun transfere(valor: Double, destino: Conta) {

    }
}


class ContaCorrente(
    titular: Cliente,
    numeroConta: Int,
) : Conta(
    titular = titular,
    numeroConta = numeroConta,
)

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int,
) : Conta(
    titular = titular,
    numeroConta = numeroConta,
)