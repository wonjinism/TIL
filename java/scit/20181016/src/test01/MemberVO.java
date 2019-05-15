package test01;

public class MemberVO {
	private String id; 
	private String password;
	
	// Constructor 생성자 : 클래스 이름과 동일, 리턴 타입이 적혀 있으면 안됨.
	public MemberVO(String id, String password){
		this.id = id;
		this.password = password;
	}
	public MemberVO() {}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + "]";
	}
	
}
