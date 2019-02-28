package customExceptions;

public class NotTypeException extends Exception {
	private int direction;
	public NotTypeException(int d) {
		super("The direction it does not correspond to this position");
		direction = d;
	}
	public int getDirection() {
		return direction;
	}

}
