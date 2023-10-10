package com.desafio.crudng.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carros",schema = "public")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    private String name;
    private Integer year;

}
