package test04;

class Printer{
	public void test() {}
//	public void test() {} // 이름과 파라미터 형태가 동일하면 에러가 발생
	public void test(int i) {} // ok
	public void test(String s) {} // ok - 타입이 다르더라도 overloading으로서 로직을 구현 가능.
	public void test(int i, String s) {} // ok - 갯수가 다르면 가능
	public void test(String s, int i) {} // ok - 순서가 달라도 가능
	public void test(int i, int j) {} 
//	public void test(int j, int i) {} // 10열과 충돌 발생 - 타입을 보고 타입의 순서를 보고 구분하는 것
}

class Person{
	private int age;
	private String name;
	Person(){} // 생성자 오버로딩 : 생성자를 여러개 정의하여 다양한 초기값을 입력받음.
	Person(int age){ // 생성자 오버로딩
		this.age = age;
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class TestOverloading {
	public static void main(String[] args) {
		// 같은 이름의 메서드를 다양한 인자값으로 정의함으로써
		// 메서드 사용자의 편의성을 높이기 위한 코딩기법
		System.out.println(1);		// println(int i){...}
		System.out.println("1");		// println(String s){...}
	}
}
