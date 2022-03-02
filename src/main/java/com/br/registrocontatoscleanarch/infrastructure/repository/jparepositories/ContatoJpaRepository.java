package com.br.registrocontatoscleanarch.infrastructure.repository.jparepositories;

import com.br.registrocontatoscleanarch.infrastructure.repository.jpaentities.ContatoJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContatoJpaRepository extends JpaRepository<ContatoJpa, UUID> {
}
