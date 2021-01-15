package multilevelexception.exception;

public class LowGasolineException extends Exception{

    public LowGasolineException(){
        super("Gasoline level is low");
    }

}
