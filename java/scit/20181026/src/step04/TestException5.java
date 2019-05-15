package step04;

public class TestException5 {
	public static void main(String[] args) {
		
		try {
		System.out.println(4/0); // by zero
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(ae.getMessage());
		}finally{ // 에러 캐치 여부와 상관없이 이 부분이 동작
			System.out.println("무조건 실행");
		}
		System.out.println("정상 수행");
	}
}