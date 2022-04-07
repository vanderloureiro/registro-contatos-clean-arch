package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.domain.Contato;
import com.br.registrocontatoscleanarch.infrastructure.repository.ContatoRepositoryAdapter;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BuscarContatosUserCaseTest {

    @Mock
    private ContatoRepositoryAdapter contatoRepository;

    @InjectMocks
    private BuscarContatosUserCase buscarContatosUserCase;

    private List<Contato> listaContatos;

    @BeforeAll
    public void setup() {
        Contato contato = Contato.builder().build();
        this.listaContatos = Arrays.asList(contato);
    }

    @Test
    public void sucesso_busca_todos_contatos() {
        when(contatoRepository.buscaTodos()).thenReturn(listaContatos);
        List<Contato> resultado = buscarContatosUserCase.buscar();
        Assertions.assertEquals(1, resultado.size());
    }

}

