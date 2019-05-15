package step05;
//소스 다운 받기
class Person{
	private String name;
	int count;
	static int sCount;
	public Person(String name) {
		super();
		this.name = name;
		count++;
		sCount++;
	}
}

public class TestStatic5 {
	public static void main(String[] args) {
		Person p1 = new Person("김지훈");
		System.out.println(p1.count);
		System.out.println("static : " + Person.sCount);
		Person p2 = new Person("김영우");
		System.out.println(p2.count);
		System.out.println("static : " + Person.sCount);
		Person p3 = new Person("김대영");
		System.out.println(p3.count);
		System.out.println("static : " + Person.sCount);
	}
}