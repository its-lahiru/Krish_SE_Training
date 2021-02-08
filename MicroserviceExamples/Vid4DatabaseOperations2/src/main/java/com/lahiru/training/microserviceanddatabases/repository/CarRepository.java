package com.lahiru.training.microserviceanddatabases.repository;

import com.lahiru.training.microserviceanddatabases.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
