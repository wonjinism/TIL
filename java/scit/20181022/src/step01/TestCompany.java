package step01;

public class TestCompany {
	/*
	 * Employee : empId, eName, salary
	 * 
	 * 	super(empId, eName, salary);
	 * 	Engineer: skill
	 * 	Manager : dept
	 * 
	 */
	public static void main(String[] args) {
		Employee e = new Employee("scm1", "아이유", 100);
		System.out.println(e.getDetails());
		Engineer en = new Engineer("scm2", "유재석", 300, "java");
		System.out.println(en.getDetails());
		Manager m = new Manager("scm3", "김보아", 200, "영업부");
		System.out.println(m.getDetails());
	}
}
