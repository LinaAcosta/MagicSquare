package customExceptions;

public class NotPositionException extends Exception{
	private int position;
	public NotPositionException(int position) {
		super("The position of the first number only can be: UP, DOWN, RIGHT or LEFT");
	}
	public int getPosition() {
		return position;
	}

}
