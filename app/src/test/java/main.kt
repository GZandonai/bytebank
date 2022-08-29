fun main() {
    println("Bem vindo ao ByteBank !")
    println(" ")


    class Conta(val titular: String, val numeroConta: Int) {
        var saldo = 0.0
        private set



        //Deposita
        fun deposita(valor: Double) {
            if (valor > 0) {
                this.saldo += valor
            }
        }


        //Saca
        fun saca(valor: Double) {~/.gitconfig
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

    val contaGiovanni = Conta("Giovanni", 15)
    contaGiovanni.deposita(200.0)
    val contaAna = Conta("Ana", 10)
    contaAna.deposita(50.00)
    val contaPatricia = Conta("Patricia", 5)
    contaPatricia.deposita (500.0)
}


//    //Transferencia
//    println("Transferência para a conta da Ana concluída.")
//    if (contaGiovanni.transfere(1500.0, contaAna)) {
//        println("Tranferência Concluída!")
//    } else {
//        println("Ocorreu uma falha na tranferência")
//    }
//
//    println(contaGiovanni.saldo)
//    println(contaAna.saldo)


//    println("Sacando da conta do Giovanni")
//    contaGiovanni.saca(1500.0)
//    println("O saldo atual da sua conta é: ${contaGiovanni.saldo}")
//    println(" ")
//    println("Sacando da conta da Ana")
//    contaGiovanni.saca(1500.0)
//    println("O saldo atual da sua conta é: ${contaAna.saldo}")


//    println("Depositando na conta do Giovanni")
//    contaGiovanni.deposita(50.0)
//    println(contaGiovanni.saldo)
//
//    println("Depositando na conta da Ana")
//    contaAna.deposita(100.0)
//    println(contaAna.saldo)


// TestaCondicoes
//fun testaCondicoes(saldo: Double) {
//
//    when {
//        saldo > 0.0 -> println("O saldo da sua conta é positivo!")
//        saldo == 0.0 -> println("Você não possui saldo em sua conta.")
//        else -> println("Sua conta esta com saldo negativo")
//    }
//}


//val titular: String = "Giovanni Z. Zandonai"
//var salario: Int = 1400
//var saldo: Double =  10.0
////saldo += 1400
////saldo -= 1200
//
//println("O nome do titular é: $titular")
//println("O salário pago para $titular é: $salario")
//println("O saldo da conta é: $saldo")
//println()