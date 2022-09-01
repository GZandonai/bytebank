class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double,
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
    get ()
    {
        return  salario + plr +0.5
    }

}

