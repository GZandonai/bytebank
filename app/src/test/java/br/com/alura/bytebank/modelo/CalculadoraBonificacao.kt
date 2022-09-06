package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
    private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }




//    fun registra(gerente: teste.Gerente){
//        this.total += gerente.bonificacao()
//    }
//    fun registra(diretor: teste.Diretor){
//        this.total += diretor.bonificacao()
//    }

}