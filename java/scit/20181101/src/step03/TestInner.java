package step03;

public class TestInner {
	public static void main(String[] args) {
		// Outer Class의 객체생성을 전제로 한다.
		Person p = new Person();
		// Outer 객체를 기반으로 Inner 객체를 생성한다.
		Person.Inner inner = p.new Inner();
		inner.innerTest();
	}
}