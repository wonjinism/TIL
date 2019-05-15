package step08;

public class Person extends Animal {
	// 메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
}
