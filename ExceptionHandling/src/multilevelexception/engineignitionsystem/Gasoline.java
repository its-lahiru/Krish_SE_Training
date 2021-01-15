package multilevelexception.engineignitionsystem;

import multilevelexception.exception.LowGasolineException;

public class Gasoline {

    public void checkCarStatus() throws Exception{
        try {
            Car car = new Car();
            car.startCar();
        } catch (LowGasolineException e) {
            throw new Exception("Caused by checkCarStatus", e);
        }
    }

}
