class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    fun autentica(senha: Int): Boolean {
        if (this.senha == this.senha) {
            return true
        }
        return false
    }

    override fun bonificacao(): Double {
        return super.bonificacao() + salario
    }
}

