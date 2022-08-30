fun main() {
    println("Bem vindo ao ByteBank !")
    println(" ")


    val paulo= Funcionario(
        "Paulo",
        "999.999.999-00",
        5000.0
    )

    val fran = Gerente(
        "Franciele",
        "111.111.111-11",
        10.000,
        123
    )

    if(fran.autentica(123)){
        println("Login efetuado com sucesso!")
    } else {
        println("Senha inválida, não foi possível fazer login.")
    }

    val gui = Diretor(
        "Guilherme",
        "222.222.222-22",
        15.000,
        321.0,
        321
    )
    if(gui.autentica(321)){
        println("Login efetuado com sucesso!")
    } else {
        println("Senha inválida, não foi possível fazer login.")
    }

    }





