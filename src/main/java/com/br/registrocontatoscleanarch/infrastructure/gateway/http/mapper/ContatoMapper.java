package com.br.registrocontatoscleanarch.infrastructure.gateway.http.mapper;

import com.br.registrocontatoscleanarch.core.models.Contato;
import com.br.registrocontatoscleanarch.infrastructure.gateway.http.request.ContatoRequest;
import com.br.registrocontatoscleanarch.infrastructure.gateway.http.response.ContatoResponse;
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

    public ContatoResponse paraResponse(Contato contato) {
        return ContatoResponse
                .builder()
                .id(contato.getId())
                .nome(contato.getNome())
                .telefone(contato.getTelefone())
                .celular(contato.getCelular())
                .email(contato.getEmail())
                .build();
    }
}
