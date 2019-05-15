package step01;

public class Bird implements Flyer { // overriding 하지 않고 abstract class로 변경 가능 
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}
}