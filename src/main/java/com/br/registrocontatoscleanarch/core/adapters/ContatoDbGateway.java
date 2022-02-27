package com.br.registrocontatoscleanarch.core.adapters;

import com.br.registrocontatoscleanarch.core.models.Contato;

import java.util.List;

public interface ContatoDbGateway {

    void salvar(Contato contato);

    List<Contato> buscaTodos();
}
