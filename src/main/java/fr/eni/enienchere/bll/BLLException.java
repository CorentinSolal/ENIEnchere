package fr.eni.enienchere.bll;

public class BLLException extends Exception{
    public BLLException() {
    }

    public BLLException(String message) {
        super(message);
    }

    public BLLException(String message, Throwable exc) {
        super(message, exc);
    }
}
