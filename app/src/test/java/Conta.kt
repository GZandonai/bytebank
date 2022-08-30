class Conta(val titular: String, val numeroConta: Int) {
    var saldo = 0.0
        private set

    val contaGiovanni = Conta("Giovanni", 15)
    contaGiovanni.deposita(200.0)
    val contaAna = Conta("Ana", 10)
    contaAna.deposita(50.00)
    val contaPatricia = Conta("Patricia", 5)
    contaPatricia.deposita (500.0)


    //Deposita
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }


    //Saca
    fun saca(valor: Double) {
        if (saldo >= valor) {
            println("Saque efetuado com sucesso!")
            this.saldo -= valor
        } else if (saldo < valor) {
            println("Saldo insuficiente,impossível sacar a quantia desejada.")
        }
    }

    //Transfere
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


}