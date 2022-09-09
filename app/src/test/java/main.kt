package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.br.com.alura.bytebank.modelo.Endereco


fun main() {
    println("Bem vindo ao ByteBank !")
    println(" ")


    val endereco = Endereco(logradouro = "Rua Botafogo", cep = "000.000")
    val enderecoNovo = Endereco(bairro = "Menino Deus", cep = "000.000")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.equals(enderecoNovo))



}
