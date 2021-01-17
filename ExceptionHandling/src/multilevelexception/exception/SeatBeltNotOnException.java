package multilevelexception.exception;

public class SeatBeltNotOnException extends Exception {

    public SeatBeltNotOnException(String s, Exception e) {
        super(s, e);
    }

}
