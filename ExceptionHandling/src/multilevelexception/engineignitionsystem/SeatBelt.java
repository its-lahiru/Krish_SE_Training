package multilevelexception.engineignitionsystem;

import multilevelexception.exception.SeatBeltNotOnException;

public class SeatBelt {

    public void checkGasolineLevel() throws Exception{
        try {
            Gasoline gasoline = new Gasoline();
            gasoline.checkCarStatus();
        } catch (SeatBeltNotOnException e){
            throw new Exception("Caused by checkGasolineLevel", e);
        }
    }

}
