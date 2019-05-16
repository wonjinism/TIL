package VO;

public class Member {
	private String username;
	private String password;

	public Member() {
	}

	public Member(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [username=" + username + ", password=" + password + "]";
	}
}
