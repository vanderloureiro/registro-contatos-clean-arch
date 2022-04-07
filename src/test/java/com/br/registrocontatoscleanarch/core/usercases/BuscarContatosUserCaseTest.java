package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.domain.Contato;
import com.br.registrocontatoscleanarch.infrastructure.repository.ContatoRepositoryAdapter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BuscarContatosUserCaseTest {

    @Mock
    private ContatoRepositoryAdapter contatoRepository;

    @InjectMocks
    private BuscarContatosUserCase buscarContatosUserCase;

    @BeforeAll
    private void setup() {}

    @Test
    public void sucesso_busca_todos_contatos() {
        when(contatoRepository.buscaTodos()).thenReturn(retornaListaContatos());
        buscarContatosUserCase.buscar();
    }

    private List<Contato> retornaListaContatos() {
        Contato contato = Contato.builder().build();
        return Arrays.asList(contato);
    }
}
