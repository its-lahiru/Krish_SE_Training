package multilevelexception.exception;

public class DoorNotClosedException extends Exception{

    public DoorNotClosedException(String s, Exception e) {
        super(s, e);
    }

    public DoorNotClosedException(String s) {
        super(s);
    }
}
