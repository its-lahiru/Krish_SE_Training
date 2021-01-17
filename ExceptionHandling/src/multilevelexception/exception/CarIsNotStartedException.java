package multilevelexception.exception;

public class CarIsNotStartedException extends Exception{

    public CarIsNotStartedException(String s, Exception e) {
        super(s, e);
    }
}
