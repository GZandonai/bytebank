package br.com.alura.bytebank.modelo




fun main() {
    println("Bem vindo ao ByteBank !")
    println(" ")


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
