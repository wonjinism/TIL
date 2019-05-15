package step01;

public class TestObject {
	public static void main(String[] args) {
		Person p1 = new Person("아이유");
		Person p2 = new Person("아이유");
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // false 주소값을 비교
		// java.lang.Object로부터 상속받은 equals는 ==와 동일
//		System.out.println(p1.name.equals(p2.name)); // 접근지정자
		System.out.println(p1.getName().equals(p2.getName()));
		// java.lang.String에서 equals()를 오버라이딩해서 문자열을 비교했다. 
		
		Car c1 = new Car("티코");
		Car c2 = new Car("티코");
		
		System.out.println(c1.equals(c2)); // true
		
	}
}