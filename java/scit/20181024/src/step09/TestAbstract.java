package step09;



abstract class Parent { // abstract 메소드가 하나 이상 존재하면 해당 클래스를 abstract로 생성 
	public void eat() {
		System.out.println("먹다");
	}
	public abstract void study(); // 메소드의 구현부가 없다. 중괄호 없음. 메소드 이름만 존재
}
class Child extends Parent {

	@Override
	public void study() {
		System.out.println("공부하다");
	}
	public void play() {
		System.out.println("놀다");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
//		new Parent(); // abstract class로는 객체 생성할 수 없다.
		Child c = new Child();
		c.study();
		c.eat();
		c.play();
		Parent p = new Child();
		p.eat();
		p.study(); // 상속과 다형성은 동일하게 사용할 수 있다.
		((Child)p).play();
	}
}