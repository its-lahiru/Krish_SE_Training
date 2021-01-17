package multilevelexception.engineignitionsystem;

import multilevelexception.exception.LowGasolineException;
import multilevelexception.exception.SeatBeltNotOnException;

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
