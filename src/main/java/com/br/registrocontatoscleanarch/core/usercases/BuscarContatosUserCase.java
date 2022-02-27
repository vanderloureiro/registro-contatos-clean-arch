package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.models.Contato;

import java.util.List;

public interface BuscarContatosUserCase {

    List<Contato> buscar();
}
