package com.br.registrocontatoscleanarch.infrastructure.repository;

import com.br.registrocontatoscleanarch.core.ports.ContatoRepository;
import com.br.registrocontatoscleanarch.core.entities.Contato;
import com.br.registrocontatoscleanarch.infrastructure.repository.jpaentities.ContatoJpa;
import com.br.registrocontatoscleanarch.infrastructure.repository.jparepositories.ContatoJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContatoRepositoryImpl implements ContatoRepository {

    private final ContatoJpaRepository contatoJpaRepository;

    public ContatoRepositoryImpl(ContatoJpaRepository contatoJpaRepository) {
        this.contatoJpaRepository = contatoJpaRepository;
    }

    @Override
    public void salvar(Contato contato) {
        ContatoJpa contatoJpa = ContatoJpa.builder()
                .id(contato.getId())
                .nome(contato.getNome())
                .telefone(contato.getTelefone())
                .celular(contato.getCelular())
                .email(contato.getEmail())
                .build();
        contatoJpaRepository.save(contatoJpa);
    }

    @Override
    public List<Contato> buscaTodos() {
        List<ContatoJpa> contatoJpaList = contatoJpaRepository.findAll();
        return contatoJpaList.stream().map(contato -> {
            return Contato.builder()
                    .id(contato.getId())
                    .nome(contato.getNome())
                    .telefone(contato.getTelefone())
                    .celular(contato.getCelular())
                    .email(contato.getEmail())
                    .build();
        }).collect(Collectors.toList());
    }
}
