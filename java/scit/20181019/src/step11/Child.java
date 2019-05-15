package step11;

public class Child extends Parent {
	private String name;
	
	Child(int age, String name){
//		부모 생성자 호출, 명시하지 않아도 자동으로 삽입
		super(age); // new Parent();
		this.name = name;
	}
}