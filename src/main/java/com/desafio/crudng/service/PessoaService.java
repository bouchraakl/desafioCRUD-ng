package com.desafio.crudng.service;

import com.desafio.crudng.entity.Pessoa;
import com.desafio.crudng.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa createPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa updatePessoa(Long id, Pessoa updatedPessoas) {
        updatedPessoas.setId(id);
        return pessoaRepository.save(updatedPessoas);
    }
}
