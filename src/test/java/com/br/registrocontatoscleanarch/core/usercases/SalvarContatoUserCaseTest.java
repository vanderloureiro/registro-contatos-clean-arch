package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.domain.Contato;
import com.br.registrocontatoscleanarch.core.exceptions.AtributoInvalidoException;
import com.br.registrocontatoscleanarch.core.ports.ContatoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SalvarContatoUserCaseTest {

    @Mock
    private ContatoRepository contatoRepository;

    @InjectMocks
    private SalvarContatoUserCase salvarContatoUserCase;

    @Test
    public void successo_salvar_contato_teste() {
        Contato contato = Contato.builder()
                .telefone("40028922")
                .email("teste@email.com")
                .nome("fulano")
                .build();
        salvarContatoUserCase.salvar(contato);
    }

    @Test
    public void excecao_email_invalido_teste() {
        Contato contato = Contato.builder()
                .telefone("40028922")
                .email("teste")
                .nome("fulano")
                .build();

        assertThrows(AtributoInvalidoException.class, () -> salvarContatoUserCase.salvar(contato));
    }

    @Test
    public void excecao_telefone_invalido_teste() {
        Contato contato = Contato.builder()
                .telefone("00")
                .email("teste@email.com")
                .nome("fulano")
                .build();

        assertThrows(AtributoInvalidoException.class, () -> salvarContatoUserCase.salvar(contato));
    }
}
