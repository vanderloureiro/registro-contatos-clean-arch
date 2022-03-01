package com.br.registrocontatoscleanarch.infrastructure.gateway.http.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContatoResponse {

    private UUID id;
    private String nome;
    private String telefone;
    private String celular;
    private String email;

}

