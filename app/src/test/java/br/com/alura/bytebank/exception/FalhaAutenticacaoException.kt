package br.com.alura.bytebank.br.com.alura.bytebank.exception

class FalhaAutenticacaoException (
    mensagem:String = "Falha na autenticacao"
        ) : Exception(mensagem)