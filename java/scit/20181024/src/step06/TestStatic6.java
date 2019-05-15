package step06;

public class TestStatic6 {
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println("main 2");
	}
	static {
		System.out.println("static init..."); // 먼저 실행됨.
	}
}
