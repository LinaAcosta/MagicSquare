package customExceptions;

public class parNumberException extends Exception {
	private int number;
	public parNumberException(int n) {
		super("The size of the magic square can't be par");
		number = n;
	}
	public int getNumber() {
		return number;
	}

}
