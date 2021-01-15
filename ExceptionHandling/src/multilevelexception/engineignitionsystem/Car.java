package multilevelexception.engineignitionsystem;

import multilevelexception.exception.LowGasolineException;

public class Car {

    public void startCar() throws Exception{
        try {
            System.out.println("Car is started");
        } catch (Exception e){
            throw new Exception("Caused by startCar", e);
        }

    }

}
