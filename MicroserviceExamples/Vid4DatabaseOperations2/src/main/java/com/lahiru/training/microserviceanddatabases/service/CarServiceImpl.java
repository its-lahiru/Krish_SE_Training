package com.lahiru.training.microserviceanddatabases.service;

import com.lahiru.training.microserviceanddatabases.model.Car;
import com.lahiru.training.microserviceanddatabases.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car fetchCarById(int id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()){
            return car.get();
        }
        return null;
    }
}
