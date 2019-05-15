package step04;

public class TestException4 {
	public static void main(String[] args) {
		String s = "일";
		String sa[] = {"하나", "둘"};
		try {
			System.out.println(sa[2]);
			int i = Integer.parseInt(s);
		}catch(NumberFormatException ne){
			System.out.println("정수 문자열을 넣어야 함!");
		}catch(Exception e) {
			e.printStackTrace(); // 예외 원인과 발생 경로를 출력한다.
			System.out.println("Exception 캐치했다!");
			System.out.println(e.getMessage()); // 위치 출력
		}
		System.out.println("정상수행");
	}
}
