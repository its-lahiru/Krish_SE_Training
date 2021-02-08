package com.lahiru.training.microserviceanddatabases.service;

import com.lahiru.training.microserviceanddatabases.model.Car;

public interface CarService {

    Car save(Car car);
    Car fetchCarById(int id);

}
