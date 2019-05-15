package step01;

public class Manager extends Employee{
	private String dept;

	public Manager(String empId, String eName, int salary, String dept) {
		super(empId, eName, salary);
		this.dept = dept;
	}

	String getDept() {
		return dept;
	}

	void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " 부서 : " + dept;
	}	
}
