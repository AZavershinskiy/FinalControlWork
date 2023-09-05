package exceptions;

public class TypeException extends RuntimeException {
    public TypeException() {
        super("Specified type of animal is unknown");
    }
}
