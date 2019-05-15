package step09;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Wonjin");
		e.setAge(34);
		System.out.println(e.getDetails());
		
		Manager m = new Manager();
		m.setName("Sonya");
		m.setAge(28);
		m.setDept("MD");
		System.out.println(m.getDetails());
	}
}
