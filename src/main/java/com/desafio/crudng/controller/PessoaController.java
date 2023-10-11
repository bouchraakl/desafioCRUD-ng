package com.desafio.crudng.controller;

import com.desafio.crudng.entity.Livro;
import com.desafio.crudng.entity.Pessoa;
import com.desafio.crudng.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping("/")
    public Pessoa createPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.createPessoa(pessoa);
    }

    @GetMapping("/")
    public List<Pessoa> getAllPessoas() {
        return pessoaService.getAllPessoas();
    }

    @PutMapping("/{id}")
    public Pessoa updatePessoas(@PathVariable Long id, @RequestBody Pessoa updatedPessoas) {
        return pessoaService.updatePessoa(id, updatedPessoas);
    }



}
