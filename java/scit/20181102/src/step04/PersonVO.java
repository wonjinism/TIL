package step04;

import java.io.Serializable;

public class PersonVO implements Serializable{
	private String name;
	private transient String password; // transient 직렬화 대상에서 제외
	
	public PersonVO(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", password=" + password + "]";
	}
	
}
