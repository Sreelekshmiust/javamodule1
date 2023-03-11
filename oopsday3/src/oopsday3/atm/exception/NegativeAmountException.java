package oopsday3.atm.exception;

public class NegativeAmountException extends Exception {

public NegativeAmountException() {
		
	}
	public NegativeAmountException(String string) {
	super(string);
}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
