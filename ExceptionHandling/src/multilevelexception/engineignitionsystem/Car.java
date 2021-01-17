package multilevelexception.engineignitionsystem;

import multilevelexception.exception.CarIsNotStartedException;
import multilevelexception.exception.LowGasolineException;

public class Car {

    public void startCar() throws Exception {

        try {
            Gasoline gasoline = new Gasoline();
            gasoline.checkGasolineLevel();
        } catch (LowGasolineException e){
            throw new CarIsNotStartedException("caused by startCar", e);
        }

    }

}
