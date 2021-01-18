package com.lahiru.training.multilevelexception.engineignitionsystem;

import com.lahiru.training.multilevelexception.exception.DoorNotClosedException;

public class Door {

    public void checkDoor() throws DoorNotClosedException {
       throw new DoorNotClosedException("Door is not closed!!!!");
    }

}
