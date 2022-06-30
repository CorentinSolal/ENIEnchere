package fr.eni.enienchere.dal;

public class DALException extends  Exception{
    public DALException() {
        // TODO Auto-generated constructor stub
    }

    public DALException(String message) {
        super(message);
    }

    public DALException(String message, Throwable exc) {
        super(message, exc);
    }
}
