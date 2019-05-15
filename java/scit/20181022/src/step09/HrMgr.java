package step09;

public class HrMgr {
	public void printAnnualSalary(Employee e) {
		System.out.println(e.getSalary() * 12);
		System.out.println(e.toString());
	}
}