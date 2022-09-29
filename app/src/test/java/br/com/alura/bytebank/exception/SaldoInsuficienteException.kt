package br.com.alura.bytebank.br.com.alura.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo eh insuficiente" ) : Exception(mensagem)