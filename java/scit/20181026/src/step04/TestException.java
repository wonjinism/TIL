package step04;

public class TestException {
	public static void main(String[] args) {
		String name = null;
		System.out.println(name.length()); // Syntax 에러는 애초에 실행이 안된다. Exception은 컴파일 단계에서 오류가 발생한다.
		System.out.println("정상수행");
	}
}
