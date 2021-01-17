package com.lahiru.training.multilevelexception.engineignitionsystem;

public class Application {

    public static void main(String[] args) {
        try {
            Car car = new Car();
            car.startCar();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}