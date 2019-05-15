package step09;

public class Manager extends Employee {
	private String dept;

	/**
	 * @return the dept
	 */
	String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	void setDept(String dept) {
		this.dept = dept;
	}
	public String getDetails() {
//		return "사원명 : " + getName() + " 나이 : " + getAge() + " 부서 : " + dept;
		return super.getDetails() + "부서 : " + dept;
	}
}
