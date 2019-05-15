package step01;

public class TestInterface1 {
	public static void main(String[] args) {
		// 상위 인터페이스 타입으로 하위 객체를 참조할 수 있다.
		Flyer f1 = new Bird();
		f1.fly();
		Flyer f2 = new SuperMan();
		f2.fly();
		// 상위 인텉페이스 타입의 배열에 자식객체를 요소로 담을 수 있다.
		Flyer fa[] = {new Bird(), new SuperMan()};
		for (int i = 0; i < fa.length; i++) {
			fa[i].fly();
		}
		System.out.println(f1 instanceof Bird);
		System.out.println(f2 instanceof SuperMan);
		System.out.println(f1 instanceof Flyer);
	}
}
