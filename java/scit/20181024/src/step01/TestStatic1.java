package step01;

class Person {
	public static void test() {
		System.out.println("static test...");
	}
}

public class TestStatic1 {
	public static void main(String[] args) {
		Person.test(); // static 선언된 method는 객체 생성없이 클래스명으로 접근이 가능하다
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random()); // api의 메서드도 static으로 접근가능
		}
	}
}
