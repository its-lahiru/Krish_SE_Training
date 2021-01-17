package com.lahiru.training.multilevelexception.engineignitionsystem;

import com.lahiru.training.multilevelexception.exception.LowGasolineException;
import com.lahiru.training.multilevelexception.exception.SeatBeltNotOnException;

public class Gasoline {

    public void checkGasolineLevel() throws Exception {

        try {
            SeatBelt seatBelt = new SeatBelt();
            seatBelt.checkSeatBelt();
        } catch (SeatBeltNotOnException e) {
            throw new LowGasolineException("Caused by checkGasolineLevel", e);
        }

    }

}
