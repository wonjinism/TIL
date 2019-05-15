package step07;

class Animal{
	public void eat() {
		System.out.println("먹다");
	}
	public void play() {
		System.out.println("놀다");
	}
}

class Monkey extends Animal{
	public void play() {
		System.out.println("나무타고 놀다");
	}
}

class Tiger extends Animal{
	public void play() {
		System.out.println("어흥하고 놀다");
	}
}

class Person extends Animal{
	public void play() {
		System.out.println("동물을 구경하며 놀다");
	}
	public void ticketing() {
		System.out.println("입장권을 구매하다");
	}
}

public class TestPoly3 {
	/*
	 * 부모 타입의 배열 객체에 다양한 자식 객체 요소를 담는 예제
	 */
	public static void main(String[] args) {
		Animal a[] = new Animal[3];
		a[0] = new Monkey();
		a[1] = new Tiger();
		a[2] = new Person();		
		// for 문을 이용해서 배열 안의 모든 요소의 play()
		for (int i = 0; i < a.length; i++) {
			a[i].play();
		}
	}
}