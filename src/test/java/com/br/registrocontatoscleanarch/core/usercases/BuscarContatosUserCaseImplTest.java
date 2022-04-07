package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.infrastructure.repository.ContatoRepositoryAdapterImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BuscarContatosUserCaseImplTest {

    @Mock
    private ContatoRepositoryAdapterImpl contatoRepository;

    @InjectMocks
    private BuscarContatosUserCaseImpl buscarContatosUserCase;

    @BeforeAll
    private void setup() {}

    @Test
    private void busca_todos_contatos_sucesso() {

    }
}
