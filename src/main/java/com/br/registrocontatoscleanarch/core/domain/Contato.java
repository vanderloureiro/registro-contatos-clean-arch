package com.br.registrocontatoscleanarch.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    private UUID id;
    private String nome;
    private String telefone;
    private String celular;
    private String email;
}
