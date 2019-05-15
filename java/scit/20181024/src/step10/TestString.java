package step10;

public class TestString {
	/*
	 * String 문자열 비교시에는 == 으로 하지 않고 equals()를 이용해 비교한다.
	 */
	public static void main(String[] args) {
		String s1 = "김지훈";
		String s2 = new String("김지훈");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
