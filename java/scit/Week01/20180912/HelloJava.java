/* public은 접근 지정자, class는 예약어. 
이미 있는 함수명은 문법으로 쓰이는 이미 만들어진 존재. 그런 이름과 똑같은 이름으로는 변수명을 만들 수 없음
HelloJava는 클래스의 이름.
String은 문자열을 담을 수 있는 객체. 자료형과 객체는 다름. 이후에 배우게 됨.
*/ 

public class HelloJava { 
	String sayHello = "안녕하세요";
	String name = "임진영";
	int age;

	public HelloJava(int newAge) { 
		age = newAge;
	}
/* 클래스의 생성자 역할을 하려면 클래스 이름의 대소문자까지 일치해야 함. 
newAge는 생성자 안에서만 생성된 것이기 때문에 메써드의 newAge와 다르다.
*/
	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public static void main(String[] args) {
		new HelloJava(28);
	}
}