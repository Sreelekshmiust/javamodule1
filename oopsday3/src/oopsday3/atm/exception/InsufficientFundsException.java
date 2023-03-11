package oopsday3.atm.exception;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException() {
		
	}
	public InsufficientFundsException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
