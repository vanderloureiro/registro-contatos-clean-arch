package com.br.registrocontatoscleanarch.infrastructure.gateway.http.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContatoRequest {

    private String nome;
    private String telefone;
    private String celular;
    private String email;

}
