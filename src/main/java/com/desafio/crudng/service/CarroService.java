package com.desafio.crudng.service;

import org.springframework.stereotype.Service;

import com.desafio.crudng.entity.Carro;
import com.desafio.crudng.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro createCar(Carro carro) {
        return carroRepository.save(carro);
    }

    public List<Carro> getAllCars() {
        return carroRepository.findAll();
    }


    public Carro updateCar(Long id, Carro updatedCar) {
            updatedCar.setId(id);
            return carroRepository.save(updatedCar);
    }

    public void deleteCar(Long id) {
        carroRepository.deleteById(id);
    }

    public Carro getById(Long id) {
        return carroRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        carroRepository.deleteById(id);
    }
}
