package br.com.alura.bytebank.modelo

open class Conta(
    val titular: Cliente,
    val numeroConta: Int,

    ) {

    private var saldo: Double = 0.0
    fun getSaldo() = saldo


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


