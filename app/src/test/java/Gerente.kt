class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: Int,
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

    override val bonificacao: Double
    get (){
        return salario + 0.8
    }
}

