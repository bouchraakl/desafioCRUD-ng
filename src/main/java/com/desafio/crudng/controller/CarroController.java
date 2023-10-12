package com.desafio.crudng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.crudng.entity.Carro;
import com.desafio.crudng.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService carroService;

    @Autowired
    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @PostMapping("/")
    public Carro createCar(@RequestBody Carro carro) {
        return carroService.createCar(carro);
    }

    @GetMapping("/")
    public List<Carro> getAllCars() {
        return carroService.getAllCars();
    }

    @GetMapping("/get/{id}")
    public Carro getById(@PathVariable Long id) {
        return carroService.getById(id);
    }

    @PutMapping("/{id}")
    public Carro updateCar(@PathVariable Long id, @RequestBody Carro updatedCar) {
        return carroService.updateCar(id, updatedCar);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carroService.delete(id);
    }



}
