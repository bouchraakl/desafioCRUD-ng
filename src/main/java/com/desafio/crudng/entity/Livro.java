package com.desafio.crudng.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "livros",schema = "public")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    private String title;
    private String author;

}
