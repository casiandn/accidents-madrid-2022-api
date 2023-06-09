package com.casiandenisweb.accidentsmadrid2022api.error;

public class InjuryNotFoundException  extends Exception{
    public InjuryNotFoundException() {
        super();
    }

    public InjuryNotFoundException(String message) {
        super(message);
    }

    public InjuryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public InjuryNotFoundException(Throwable cause) {
        super(cause);
    }

    protected InjuryNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
