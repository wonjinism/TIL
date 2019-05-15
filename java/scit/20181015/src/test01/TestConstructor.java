package test01;
/*
 * 하나의 파일에서 여러개의 클래스 정의가 가능하다.
 * 이 경우 파일명은 메인 메서드가 있는 클래스명으로 하고
 * 클래스 팡 접근 제어자 public은 메인이 있는 클래스 앞에
 * 한번만 정의 가능하다.
 */
class Person{
//	생성자(constructor)를 명시하면 자동삽입을 안한다.
//	개체를 생성할 때 초기값으로 지정하고 싶은 전역변수가 있다던가 할 경우에 사용한다.
// 예를 들어 신용카드는 인적정보를 가진 사람만 생성할 수 있다고 했을 때 사용한다. 카드쩜.
//	Person(){} 비워두면 이렇게 있는 것으로 인식 
	Person(){
		System.out.println("Person 생성자 실행");
	}
}

class MemberVO{
	/*
	 * 생성자명은 반드시 클래스명과 일치해야 하고! 리턴타입은 적지 않는다.
	 * 생성자명이 클래스명과 일치하는가? 리턴타입은? 이 두가지를 보고 생성자인지 아닌지 판단.
	 * 회원 객체는 반드시 아이디를 할당받을 때만 생성
	 * 이 경우 인자값 있는 생성자를 정의해야 한다.
	 */
	MemberVO(String id){ // String 파라미터가 있어야 한다.
		System.out.println(id + " member object is created..");
	}
}


public class TestConstructor {
	public static void main(String[] args) {
		new Person(); // new 객체를 생성해주는 키워드, Person()생성자라고 함.
		new MemberVO("\"Java\"");
		
	}
}
