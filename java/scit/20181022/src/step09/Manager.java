package step09;

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
	public String toString() {
		return "Manager [dept=" + dept + "getEmpId()" + getEmpId() + "geteName()" + geteName() + "getSalary()" + getSalary() + "]";
	}
}
