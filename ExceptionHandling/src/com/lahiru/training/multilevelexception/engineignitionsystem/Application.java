package com.lahiru.training.multilevelexception.engineignitionsystem;

import com.lahiru.training.multilevelexception.exception.CarIsNotStartedException;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Car car = new Car();
            car.startCar();
        } catch (CarIsNotStartedException e){
            e.printStackTrace();
        }
    }
}