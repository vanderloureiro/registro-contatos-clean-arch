package com.br.registrocontatoscleanarch.infrastructure.repository.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "contato")
public class ContatoJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String telefone;
    private String celular;
    private String email;

}
