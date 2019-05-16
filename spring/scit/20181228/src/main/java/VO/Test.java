package VO;

public class Test {
	private String id;
	private String pw;
	
	public Test(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public Test() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", pw=" + pw + "]";
	}
}
