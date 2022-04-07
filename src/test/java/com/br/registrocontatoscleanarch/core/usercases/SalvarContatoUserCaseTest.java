package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.infrastructure.repository.jparepositories.ContatoJpaRepository;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SalvarContatoUserCaseTest {

    @Mock
    private ContatoJpaRepository contatoJpaRepository;

    @InjectMocks
    private SalvarContatoUserCase salvarContatoUserCase;
}
