package com.br.registrocontatoscleanarch.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    private String nome;
    private String telefone;
    private String celular;
    private String email;
}
