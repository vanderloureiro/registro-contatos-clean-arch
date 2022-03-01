package com.br.registrocontatoscleanarch.infrastructure.repository.jpa;

import com.br.registrocontatoscleanarch.infrastructure.repository.entities.ContatoJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContatoJpaRepository extends JpaRepository<ContatoJpa, UUID> {
}
