package multilevelexception.engineignitionsystem;

import multilevelexception.exception.DoorNotClosedException;
import multilevelexception.exception.SeatBeltNotOnException;

public class SeatBelt{

    public void checkSeatBelt() throws Exception {

        try {
            Door door = new Door();
            door.checkDoor();
        } catch (DoorNotClosedException e){
            throw new SeatBeltNotOnException("caused by checkSeatBelt", e);
        }

    }

}
