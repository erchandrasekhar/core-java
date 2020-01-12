package exceptionHandling.throwAndthrows.customException;

public class NoNumberFoundException extends Exception {
	
	int n;

	public NoNumberFoundException(int n) {
		super();
		this.n = n;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return Integer.toString(n);
	}

}
