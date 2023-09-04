package exceptions;

public class BirthdayException extends RuntimeException {
    public BirthdayException() {
        super("Invalid birthday");
    }
}
