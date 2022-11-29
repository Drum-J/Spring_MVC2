package hello.exception.exception;

public class UserExceptione extends RuntimeException {

    public UserExceptione() {
        super();
    }

    public UserExceptione(String message) {
        super(message);
    }

    public UserExceptione(String message, Throwable cause) {
        super(message, cause);
    }

    public UserExceptione(Throwable cause) {
        super(cause);
    }

    protected UserExceptione(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
