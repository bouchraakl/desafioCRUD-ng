package com.desafio.crudng.service;

import com.desafio.crudng.entity.Carro;
import com.desafio.crudng.entity.Livro;
import com.desafio.crudng.repository.CarroRepository;
import com.desafio.crudng.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> getAllLivro() {
        return livroRepository.findAll();
    }

    public Livro updateLivro(Long id, Livro updatedLivro) {
        updatedLivro.setId(id);
        return livroRepository.save(updatedLivro);
    }

    public Livro getById(Long id) {
            return livroRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }
}
