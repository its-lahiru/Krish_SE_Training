package com.lahiru.training.multilevelexception.exception;

public class LowGasolineException extends Exception{

    public LowGasolineException(String s, Exception e) {
        super(s, e);
    }
}
