open class Conta(val titular: String, val numeroConta: Int) {
    var saldo = 0.0
    private set



    //Deposita
    open fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Deposito realizado")
        }
    }


    //Saca
    open fun saca(valor: Double) {
        if (saldo >= valor) {
            println("Saque efetuado com sucesso!")
            this.saldo -= valor
        } else if (saldo < valor) {
            println("Saldo insuficiente,impossível sacar a quantia desejada.")
        }
    }

    //Transfere
    open fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


}