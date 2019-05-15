package step02;

public class TestSchool {
	public static void main(String[] args) {
		Person p = new Person("Sonyaa", "1111");
		System.out.println(p.getInfo());
		Student s = new Student("Wonjin", "2222", "12");
		System.out.println(s.getInfo());
		Teacher t = new Teacher("Jihoon", "3333", "7442");
		System.out.println(t.getInfo());
	}
}