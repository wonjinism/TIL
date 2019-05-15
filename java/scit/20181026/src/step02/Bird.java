package step02;

public class Bird extends Animal implements Flyer { // overriding 하지 않고 abstract class로 변경 가능 
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}
	public void sing() {
		System.out.println("새가 노래하다");
	}
}