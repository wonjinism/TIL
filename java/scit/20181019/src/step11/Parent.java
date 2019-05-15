package step11;
// 상속을 명시하지 않은 클래스는 extends Object가 삽입된다.
// 즉 모든 클래스의 부모는 java.lang.Object 클래스이다.
public class Parent {
	private int age;
	Parent(int age){
		this.age = age;
	}	
}
