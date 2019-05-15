package step03;

class Animal { // extends Object
} 

class Car {
	private String model = "K5";
	// 주소값 대신에 객체의 필드 속성을 반환하기 위해서 오버라이드
	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
}

public class TestObject {
	public static void main(String[] args) {
		Animal a = new Animal(); 
		System.out.println(a.toString()); // Object라는 최상위 객체에 들어가 있는 메소드;
		System.out.println(a); // toString()을 가져와서 출력. 주소값을 가지는 변수를 참조변수라고 하기도 한다. 
		Car c = new Car();
		System.out.println(c.toString());
		System.out.println(c);
	}
}