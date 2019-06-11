package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 인스턴스가 매번 새로 생성되므로 주소 값이 서로 다름
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
