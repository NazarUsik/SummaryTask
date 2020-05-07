package ua.nure.usik.SummaryTask4.exception;

/**
 * An exception that provides information on an application error.
 * 
 * @author N.Usik
 * 
 */
public class AppException extends Exception {

	public AppException() {
		super();
	}

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}

	public AppException(String message) {
		super(message);
	}

}
