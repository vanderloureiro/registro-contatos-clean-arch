package com.br.registrocontatoscleanarch.infrastructure.configuration;

import com.br.registrocontatoscleanarch.core.usercases.BuscarContatosUserCaseImpl;
import com.br.registrocontatoscleanarch.core.usercases.SalvarContatoUserCaseImpl;
import com.br.registrocontatoscleanarch.infrastructure.repository.ContatoRepositoryImpl;
import com.br.registrocontatoscleanarch.infrastructure.repository.jpa.ContatoJpaRepository;
import com.br.registrocontatoscleanarch.infrastructure.repository.mapper.ContatoRepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContatoConfiguration {

    @Autowired
    private ContatoJpaRepository contatoJpaRepository;
    @Autowired
    private ContatoRepositoryMapper contatoRepositoryMapper;

    @Bean
    public SalvarContatoUserCaseImpl salvarContatoUserCaseImpl() {
        return new SalvarContatoUserCaseImpl(contatoServiceRepository());
    }

    @Bean
    public BuscarContatosUserCaseImpl buscarContatosUserCaseImpl() {
        return new BuscarContatosUserCaseImpl(contatoServiceRepository());
    }

    @Bean
    public ContatoRepositoryImpl contatoServiceRepository() {
        return new ContatoRepositoryImpl(contatoJpaRepository, contatoRepositoryMapper);
    }
}
