package servconn.client;

public class EkClientException extends Exception {

	private static final long serialVersionUID = -7421911495666799753L;

	private int errorId;
	
	public EkClientException() {
		super();
	}

	public EkClientException(String message) {
		super(message);		
	}

	public EkClientException(String message, int errorId) {
		super(message);	
		this.errorId = errorId;
	}

	
	public EkClientException(Throwable arg0) {
		super(arg0);
	}

	public EkClientException(String message, int errorId, Throwable arg1) {
		super(message, arg1);
		this.errorId = errorId;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " errorId: " + errorId;
	}
	
	public int getErrorId() {
		return errorId;		
	}



}
