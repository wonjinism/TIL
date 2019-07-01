package exception;

public class PasswordException extends Exception {
	public PasswordException(String password) {
		super(password);
	}
}
