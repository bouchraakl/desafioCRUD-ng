package com.desafio.crudng.repository;

import com.desafio.crudng.entity.Livro;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Id> {
}
