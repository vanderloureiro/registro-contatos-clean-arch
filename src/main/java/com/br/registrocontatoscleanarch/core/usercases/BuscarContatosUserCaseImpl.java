package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.adapters.ContatoDbGateway;
import com.br.registrocontatoscleanarch.core.models.Contato;

import java.util.List;

public class BuscarContatosUserCaseImpl implements BuscarContatosUserCase {

    private final ContatoDbGateway contatoDbGateway;

    public BuscarContatosUserCaseImpl(ContatoDbGateway contatoDbGateway) {
        this.contatoDbGateway = contatoDbGateway;
    }

    @Override
    public List<Contato> buscar() {
        return contatoDbGateway.buscaTodos();
    }
}
