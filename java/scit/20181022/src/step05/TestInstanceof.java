package step05;

import step04.Animal;
import step04.Person;

class Monkey extends Animal {}

public class TestInstanceof {
	/*
	 * Instanceof 연산자 : 객체의 타입을 비교해서 판단합니다.
	 */
	public static void main(String[] args) {
		Monkey m = new Monkey();
		if (m instanceof Monkey) {
			System.out.println("Monkey 객체");
		}
		Animal a = new Person();
		Person p = new Person();
		System.out.println(a instanceof Person);
		// instanceof 는 is a 관계이면 true를 반환한다.
		// 비교할 때 자식에서부터 부모의 순서로 비교해 나간다. 
		System.out.println(a instanceof Animal); // 알맹이는 Person이지만 부모가 Animal이면 True 반환
		System.out.println(a instanceof Monkey);
		System.out.println(p instanceof Animal);
	}
}