package step09;

public class Employee {
	private String empId;
	private String eName;
	private int salary;
	public Employee(String empId, String eName, int salary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", salary=" + salary + "]";
	}
}