package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.ports.ContatoRepository;
import com.br.registrocontatoscleanarch.core.models.Contato;

import java.util.List;

public class BuscarContatosUserCaseImpl implements BuscarContatosUserCase {

    private final ContatoRepository contatoRepository;

    public BuscarContatosUserCaseImpl(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Override
    public List<Contato> buscar() {
        return contatoRepository.buscaTodos();
    }
}
