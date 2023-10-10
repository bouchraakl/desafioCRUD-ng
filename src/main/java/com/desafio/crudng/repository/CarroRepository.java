package com.desafio.crudng.repository;

import com.desafio.crudng.entity.Carro;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Id> {
}
