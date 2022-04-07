package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.ports.ContatoRepository;
import com.br.registrocontatoscleanarch.core.domain.Contato;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BuscarContatosUserCase {

    private final ContatoRepository contatoRepository;

    public BuscarContatosUserCase(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public List<Contato> buscar() {
        log.info("Buscando todos os contatos");
        return contatoRepository.buscaTodos();
    }
}
