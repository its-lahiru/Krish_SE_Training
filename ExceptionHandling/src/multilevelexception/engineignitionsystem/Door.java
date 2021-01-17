package multilevelexception.engineignitionsystem;

import multilevelexception.exception.DoorNotClosedException;

public class Door {

    public void checkDoor() throws Exception {
       throw new DoorNotClosedException("Door is not closed!!!!");
    }

}
