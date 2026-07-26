package day07_exceptionhandling;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}