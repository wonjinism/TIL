package step10;

public class Child extends Parent {
	Child(){
//		부모 생성자 호출, 명시하지 않아도 자동으로 삽입
//		super(); // new Parent();
		System.out.println("Child 생성자 호출... 객체 생성");
	}
}
