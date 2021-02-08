package com.lahiru.training.microserviceanddatabases.controller;

import com.lahiru.training.microserviceanddatabases.model.Car;
import com.lahiru.training.microserviceanddatabases.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public Car save(@RequestBody Car car){
        return carService.save(car);
    }

    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public ResponseEntity<Car> fetchCarById(@RequestParam int id){
        Car car = carService.fetchCarById(id);
        if (car == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(car);
    }

}
