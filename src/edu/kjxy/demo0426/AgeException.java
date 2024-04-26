package edu.kjxy.demo0426;

public class AgeException extends RuntimeException{
    private AgeException() { };

    public AgeException(String msg) {
        super(msg);
    }
}
