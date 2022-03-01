package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.ports.ContatoRepository;
import com.br.registrocontatoscleanarch.core.models.Contato;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BuscarContatosUserCaseImpl implements BuscarContatosUserCase {

    private final ContatoRepository contatoRepository;

    public BuscarContatosUserCaseImpl(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Override
    public List<Contato> buscar() {
        log.info("Buscando todos os contatos");
        return contatoRepository.buscaTodos();
    }
}
