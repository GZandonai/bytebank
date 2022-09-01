abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,

    ) {
    abstract val bonificacao: Double
<<<<<<< HEAD

=======
    get (){
        return salario * 0.1
    }
>>>>>>> 94267aa6d7846c560aa1c4f1cc6962280dd09394


}