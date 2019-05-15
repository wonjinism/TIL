package step03;

public class TestStatic3 {
	public static void main(String[] args) {
		//api static method 활용 방법
		String s1 = "1";
		String s2 = "2";
		int i = Integer.parseInt(s1); // 스트링으로 바꿔주는
		int j = Integer.parseInt(s2);
		System.out.println(s1 + s2); // 12
		System.out.println(i + j); // 3
	}
}
