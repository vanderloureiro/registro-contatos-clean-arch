package com.br.registrocontatoscleanarch.infrastructure.gateway.http;

import com.br.registrocontatoscleanarch.core.models.Contato;
import com.br.registrocontatoscleanarch.core.usercases.BuscarContatosUserCase;
import com.br.registrocontatoscleanarch.core.usercases.SalvarContatoUserCase;
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

    public ContatoResource(SalvarContatoUserCase salvarContatoUserCase, BuscarContatosUserCase buscarContatosUserCase) {
        this.salvarContatoUserCase = salvarContatoUserCase;
        this.buscarContatosUserCase = buscarContatosUserCase;
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody ContatoRequest request) {
        Contato contato = Contato.builder()
                .nome(request.getNome())
                .telefone(request.getTelefone())
                .celular(request.getCelular())
                .email(request.getEmail())
                .build();
        salvarContatoUserCase.salvar(contato);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<ContatoResponse>> buscarTodos() {
        List<Contato> contatos = buscarContatosUserCase.buscar();
        List<ContatoResponse> contatosResponse = contatos.
                stream().map(contato -> {
                    return ContatoResponse.builder()
                            .id(contato.getId())
                            .nome(contato.getNome())
                            .telefone(contato.getTelefone())
                            .celular(contato.getCelular())
                            .email(contato.getEmail())
                            .build();
                }).collect(Collectors.toList());
        return ResponseEntity.ok().body(contatosResponse);
    }
}
