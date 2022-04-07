package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.infrastructure.repository.jparepositories.ContatoJpaRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SalvarContatoUserCaseImplTest {

    @Mock
    private ContatoJpaRepository contatoJpaRepository;

    @InjectMocks
    private SalvarContatoUserCaseImpl salvarContatoUserCase;
}
