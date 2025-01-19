
package booking.models;

public class UserNotFountException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public UserNotFountException(String message, Throwable err) {
        super(message, err);
    }
	
	 public UserNotFountException(String message) {
	        super(message);
	    }

}



