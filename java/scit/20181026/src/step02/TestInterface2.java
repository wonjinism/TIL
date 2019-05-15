package step02;

public class TestInterface2 {
	public static void main(String[] args) {
		Flyer fa[] = new Flyer[5];
		fa[0] = new SuperMan();
		fa[1] = new Bird();
		fa[2] = new Eagle(); // Bird를 상속 받았기 때문에 Flyer 타입으로 인식된다.
//		fa[3] = new Animal(); // Flyer와 관계 없다.

		System.out.println(fa[2] instanceof Flyer);
		System.out.println(fa[2] instanceof Bird);
		System.out.println(fa[2] instanceof Eagle);
		
		Fighter fg[] = new Fighter[2];
		fg[0] = new SuperMan();
		fg[1] = new Eagle();
		
		System.out.println();
		System.out.println(fg[0] instanceof Animal);
		System.out.println(fg[0] instanceof Bird);
		System.out.println(fg[1] instanceof Fighter);
		System.out.println(fg[1] instanceof Bird);
	}
}
