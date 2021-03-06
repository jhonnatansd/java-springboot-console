package pe.com.spring.console.exception;

public class ProcessException extends RuntimeException {
	
	private static final long serialVersionUID = 6230130043655065520L;

	public ProcessException(String message) {
        super(message);
    }

}
