fun testaFuncionarios() {

    val paulo = Diretor(
        "Paulo",
        "999.999.999-00",
        15.000,
        100.0,
        321
    )
    if (paulo.autentica(321)) {
        println("Login efetuado com sucesso!")
    } else {
        println("Senha inválida, não foi possível fazer login.")
    }

    val ana = Gerente(
        "Ana",
        "111.111.111-11",
        10.000,
        123
    )

    if (ana.autentica(123)) {
        println("Login efetuado com sucesso!")
    } else {
        println("Senha inválida, não foi possível fazer login.")
    }

    val giovanni = Analista(
        "Giovanni",
        "222.222.222-22",
        2.000,
    )


    val patricia = Auxiliar(
        "Patricia",
        "555.555.555-55",
        1.400
    )
}