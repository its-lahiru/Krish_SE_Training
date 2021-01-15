package multilevelexception.engineignitionsystem;

import multilevelexception.exception.DoorNotClosedException;

public class Door {

    public void checkSeatBelt() throws Exception{
        try {
            SeatBelt seatBelt = new SeatBelt();
            seatBelt.checkGasolineLevel();
        } catch (DoorNotClosedException e){
            throw new Exception("Caused by checkSeatBelt", e);
        }
    }

}
