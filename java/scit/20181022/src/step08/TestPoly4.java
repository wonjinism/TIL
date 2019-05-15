package step08;

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

class ZooMgr{
	public void enter(Animal[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Animal) {
				System.out.println(a[i].getClass().getSimpleName() + "가 입장 가능합니다.");
			} 
			if (a[i] instanceof Person) {
//				Person p = (Person)a[i];
//				p.ticketing();
				((Person)a[i]).ticketing(); // 위 코드 두 줄을 한 줄로 축소 가능함.
			}
			a[i].eat();
			a[i].play();			
		}
	}
}

public class TestPoly4 {
	public static void main(String[] args) {
//		Animal a[] = new Animal[3];
//		a[0] = new Monkey();
//		a[1] = new Tiger();
//		a[2] = new Person();
		Animal a[] = {new Monkey(), new Tiger(), new Person()}; 
		ZooMgr zoo = new ZooMgr();
		zoo.enter(a);		
	}
}