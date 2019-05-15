package step08;

final class A {}
//class B extends A {} // final class는 상속이 불가능하다.
class C {
	public final void c() {}
}
class D extends C {
//	public void c() {} // final 메서드는 오버라이딩이 불가능하다.
}
class E {
	public static final int MY_ID = 1; // final은 상수이므로 대문자,
									   // 합성어는 _ 로 연결해서 표현한다.
	void e() {
//		MY_ID = 2; // final 상수는 재할당 불가능
	}
}
public class TestFinal {
	public static void main(String[] args) {
		System.out.println(E.MY_ID);
	}
}