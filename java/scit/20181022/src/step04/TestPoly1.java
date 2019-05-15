package step04;

public class TestPoly1 {
	public static void main(String[] args) {
		// 부모타입의 참조변수에 자식객체의 주소값을 할당
		Animal a = new Person();
		// 부모타입의 변수로 사용할 수 있는 범위 체크
		a.sleep(); // 사용가능함
		a.eat(); // 오버라이딩한 메서드가 사용되었다.
//		a.study(); // 자식객체로 생성은 했지만, 자식객체의 독자적인 멤버(변수, 메서드)로 접근은 불가능
		// 이 경우 독자적인 멤버를 호출하기 위해서는 객체 캐스팅(down casting)이 필요
		Person p = (Person)a; // 부모의 타입을 가지는 변수에 넣어서 사용이 안되었던 것을 
		p.study();
		// 추가로 줄여서 사용한다면
		((Person)a).study(); // 가지고는 있지만 접근이 불가능한 부분을 객체 캐스팅을 통해서 접근
	}
}