package step06;

public class Bank {
	public void publicTest() {
		System.out.println("publicTest");
		privateTest();
	}
	protected void protectedTest() {
		System.out.println("protectedTest");
	}
	void defaultTest() { // 접근지정자가 없을 때는 default로 지정됨.
		System.out.println("defaultTest");
	}
	private void privateTest() {
		System.out.println("privateTest");
	}
}
