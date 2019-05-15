package step09;

public class Employee {
	private String name;
	private int age;
	
	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	void setAge(int age) {
		this.age = age;
	}

	public String getDetails() {
		return "사원명 : " + name + " 나이 : " + age;
	}
}
