package com.casiandenisweb.accidentsmadrid2022api.error;

public class AccidentNotFoundException extends Exception{

    public AccidentNotFoundException() {
        super();
    }

    public AccidentNotFoundException(String message) {
        super(message);
    }

    public AccidentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccidentNotFoundException(Throwable cause) {
        super(cause);
    }

    protected AccidentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}