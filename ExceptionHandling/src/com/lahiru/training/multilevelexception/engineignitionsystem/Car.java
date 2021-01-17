package com.lahiru.training.multilevelexception.engineignitionsystem;

import com.lahiru.training.multilevelexception.exception.CarIsNotStartedException;
import com.lahiru.training.multilevelexception.exception.LowGasolineException;

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
