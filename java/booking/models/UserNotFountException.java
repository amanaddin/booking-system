
package booking.models;

public class UserNotFountException extends RuntimeException {

    public UserNotFountException(String message, Throwable err) {
        super(message, err);
    }
}



