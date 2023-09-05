package exceptions;

public class QuestionException extends RuntimeException {
    public QuestionException() {
        super("Input error");
    }
}
