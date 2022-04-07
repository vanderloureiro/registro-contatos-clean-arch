package com.br.registrocontatoscleanarch.core.ports;

import com.br.registrocontatoscleanarch.core.domain.Contato;

import java.util.List;

public interface ContatoRepository {

    void salvar(Contato contato);

    List<Contato> buscaTodos();
}
