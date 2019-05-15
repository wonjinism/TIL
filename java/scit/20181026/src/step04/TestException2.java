package step04;

public class TestException2 {
	public static void main(String[] args) {
		String name = null;
		try { // Exception 발생 예상 지점에 try로 블럭
			System.out.println(name.length());
		} catch(NullPointerException ne) { // catch 로 Exception 객체를 처리 = 대처 방안을 정의
			// NullPointException 의 부모인 Exception 으로도 받을 수 있다.
			System.out.println("null 이므로 길이를 구할 수 없음");
		}
		System.out.println("정상수행");
	}
}
