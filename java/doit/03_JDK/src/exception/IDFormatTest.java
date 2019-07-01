package exception;

public class IDFormatTest {
	private String userID;
	private String password;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException{
		if(password == null) {
			throw new PasswordException("패스워드는 null일 수 없습니다.");
		} else if(password.length() < 5) {
			throw new PasswordException("패스워드는 6자 이상으로 쓰세요.");
		} else if(!(password.matches("[a-zA-Z]"))) {
			throw new PasswordException("패스워드는 문자열로만 쓰세요.");
		}
	}
	
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		String password = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		password = "abc1";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		try {
			test.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
