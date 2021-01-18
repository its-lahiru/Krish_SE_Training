package com.lahiru.training.multilevelexception.engineignitionsystem;

import com.lahiru.training.multilevelexception.exception.DoorNotClosedException;
import com.lahiru.training.multilevelexception.exception.SeatBeltNotOnException;

public class SeatBelt{

    public void checkSeatBelt() throws SeatBeltNotOnException {

        try {
            Door door = new Door();
            door.checkDoor();
        } catch (DoorNotClosedException e){
            throw new SeatBeltNotOnException("caused by checkSeatBelt", e);
        }

    }

}
