package com.br.registrocontatoscleanarch.infrastructure.gateway.mapper;

import com.br.registrocontatoscleanarch.core.models.Contato;
import com.br.registrocontatoscleanarch.infrastructure.gateway.request.ContatoRequest;
import org.springframework.stereotype.Component;

@Component
public class ContatoMapper {

    public Contato paraEntidade(ContatoRequest request) {
        return Contato.builder()
                .nome(request.getNome())
                .telefone(request.getTelefone())
                .celular(request.getCelular())
                .email(request.getEmail())
                .build();
    }
}
