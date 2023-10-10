package com.desafio.crudng.repository;

import com.desafio.crudng.entity.Pessoa;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Id> {
}
