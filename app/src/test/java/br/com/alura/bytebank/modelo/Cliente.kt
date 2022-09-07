package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.br.com.alura.bytebank.modelo.Endereco

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private  val senha: Int,
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}

