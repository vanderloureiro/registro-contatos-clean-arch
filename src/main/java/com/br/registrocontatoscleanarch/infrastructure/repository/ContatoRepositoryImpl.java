package com.br.registrocontatoscleanarch.infrastructure.repository;

import com.br.registrocontatoscleanarch.core.adapters.ContatoDbGateway;
import com.br.registrocontatoscleanarch.core.models.Contato;
import com.br.registrocontatoscleanarch.infrastructure.repository.jpa.ContatoJpaRepository;
import com.br.registrocontatoscleanarch.infrastructure.repository.mapper.ContatoRepositoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoRepositoryImpl implements ContatoDbGateway {

    private final ContatoJpaRepository contatoJpaRepository;
    private final ContatoRepositoryMapper contatoRepositoryMapper;

    public ContatoRepositoryImpl(ContatoJpaRepository contatoJpaRepository, ContatoRepositoryMapper contatoRepositoryMapper) {
        this.contatoJpaRepository = contatoJpaRepository;
        this.contatoRepositoryMapper = contatoRepositoryMapper;
    }

    @Override
    public void salvar(Contato contato) {
        // todo
    }

    @Override
    public List<Contato> buscaTodos() {
        return null;
    }
}
