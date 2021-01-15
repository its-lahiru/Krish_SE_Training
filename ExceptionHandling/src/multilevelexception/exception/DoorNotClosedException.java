package multilevelexception.exception;

public class DoorNotClosedException extends Exception{

    public DoorNotClosedException(){
        super("Door is not closed");
    }

}
