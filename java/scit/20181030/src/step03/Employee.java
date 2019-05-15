package step03;

public class Employee {
	private String ename;
	private int salary;
	public Employee(String ename, int salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
}
