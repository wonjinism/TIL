package step04;

public class TestInheritance {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.bonus);
		System.out.println(c.money); // 상속 받았으므로 접근 가능
		c.eat();
		
		Parent p = new Parent();
//		System.out.println(p.bonus); // 반대로 부모는 자식의 bonus에 접근 불가능
		System.out.println(p.money);
		p.eat();
	}
}
