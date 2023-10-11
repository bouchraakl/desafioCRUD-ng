package com.desafio.crudng.controller;

import com.desafio.crudng.entity.Livro;
import com.desafio.crudng.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;
    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping("/")
    public Livro createLivro(@RequestBody Livro livro) {
        return livroService.createLivro(livro);
    }

    @GetMapping("/")
    public List<Livro> getAllLivros() {
        return livroService.getAllLivro();
    }

    @PutMapping("/{id}")
    public Livro updateLivro(@PathVariable Long id, @RequestBody Livro updatedLivro) {
        return livroService.updateLivro(id, updatedLivro);
    }




}
