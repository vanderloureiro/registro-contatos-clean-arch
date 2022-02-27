package com.br.registrocontatoscleanarch.infrastructure.configuration;

import com.br.registrocontatoscleanarch.core.usercases.BuscarContatosUserCaseImpl;
import com.br.registrocontatoscleanarch.core.usercases.SalvarContatoUserCaseImpl;
import com.br.registrocontatoscleanarch.infrastructure.repository.ContatoRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContatoConfiguration {

    @Autowired
    private ContatoRepositoryImpl contatoRepositoryImpl;

    @Bean
    public SalvarContatoUserCaseImpl salvarContatoUserCaseImpl() {
        return new SalvarContatoUserCaseImpl(contatoRepositoryImpl);
    }

    @Bean
    public BuscarContatosUserCaseImpl buscarContatosUserCaseImpl() {
        return new BuscarContatosUserCaseImpl(contatoRepositoryImpl);
    }

}
