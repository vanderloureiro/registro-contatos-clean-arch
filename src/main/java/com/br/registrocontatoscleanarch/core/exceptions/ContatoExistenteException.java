package com.br.registrocontatoscleanarch.core.exceptions;

public class ContatoExistenteException extends RuntimeException {

    public ContatoExistenteException(String mensagem) {
        super(mensagem);
    }
}
