abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,

    ) {

    abstract val bonificacao: Double


    open fun autentica(senha: Int): Boolean {
        if (senha == senha ) {
            return true
        }
        return false
    }
}