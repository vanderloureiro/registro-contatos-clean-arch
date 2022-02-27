package com.br.registrocontatoscleanarch.infrastructure.gateway.http;

import com.br.registrocontatoscleanarch.core.usercases.SalvarContatoUserCase;
import com.br.registrocontatoscleanarch.infrastructure.gateway.mapper.ContatoMapper;
import com.br.registrocontatoscleanarch.infrastructure.gateway.request.ContatoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contato")
public class ContatoResource {

    private final SalvarContatoUserCase salvarContatoUserCase;
    private final ContatoMapper contatoMapper;

    public ContatoResource(SalvarContatoUserCase salvarContatoUserCase, ContatoMapper contatoMapper) {
        this.salvarContatoUserCase = salvarContatoUserCase;
        this.contatoMapper = contatoMapper;
    }

    @GetMapping
    public ResponseEntity<Void> salvar(ContatoRequest request) {
        salvarContatoUserCase.salvar(contatoMapper.paraEntidade(request));
        return ResponseEntity.ok().build();
    }
}
