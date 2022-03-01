package com.br.registrocontatoscleanarch.infrastructure.gateway.http;

import com.br.registrocontatoscleanarch.core.models.Contato;
import com.br.registrocontatoscleanarch.core.usercases.BuscarContatosUserCase;
import com.br.registrocontatoscleanarch.core.usercases.SalvarContatoUserCase;
import com.br.registrocontatoscleanarch.infrastructure.gateway.http.mapper.ContatoMapper;
import com.br.registrocontatoscleanarch.infrastructure.gateway.http.request.ContatoRequest;
import com.br.registrocontatoscleanarch.infrastructure.gateway.http.response.ContatoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/contato")
public class ContatoResource {

    private final SalvarContatoUserCase salvarContatoUserCase;
    private final BuscarContatosUserCase buscarContatosUserCase;
    private final ContatoMapper contatoMapper;

    public ContatoResource(SalvarContatoUserCase salvarContatoUserCase, BuscarContatosUserCase buscarContatosUserCase, ContatoMapper contatoMapper) {
        this.salvarContatoUserCase = salvarContatoUserCase;
        this.buscarContatosUserCase = buscarContatosUserCase;
        this.contatoMapper = contatoMapper;
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody ContatoRequest request) {
        salvarContatoUserCase.salvar(contatoMapper.paraEntidade(request));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<ContatoResponse>> buscarTodos() {
        List<Contato> contatos = buscarContatosUserCase.buscar();
        List<ContatoResponse> contatosResponse = contatos.
                stream().map(contatoMapper::paraResponse).collect(Collectors.toList());
        return ResponseEntity.ok().body(contatosResponse);
    }
}
