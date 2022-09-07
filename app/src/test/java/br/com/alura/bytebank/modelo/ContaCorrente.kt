package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int,
) : Conta(
    titular = titular,
    numeroConta = numeroConta,
)
