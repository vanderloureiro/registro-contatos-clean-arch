package com.br.registrocontatoscleanarch.infrastructure.configuration;

import com.br.registrocontatoscleanarch.core.usercases.BuscarContatosUserCase;
import com.br.registrocontatoscleanarch.core.usercases.SalvarContatoUserCase;
import com.br.registrocontatoscleanarch.infrastructure.repository.ContatoRepositoryAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContatoConfiguration {

    @Autowired
    private ContatoRepositoryAdapter contatoRepositoryAdapter;

    @Bean
    public SalvarContatoUserCase salvarContatoUserCase() {
        return new SalvarContatoUserCase(contatoRepositoryAdapter);
    }

    @Bean
    public BuscarContatosUserCase buscarContatosUserCase() {
        return new BuscarContatosUserCase(contatoRepositoryAdapter);
    }

}
