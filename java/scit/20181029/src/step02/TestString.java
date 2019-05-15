package step02;


public class TestString {
	public static void main(String[] args) {
//		String s1 = "아이유";
		String s1 = new String("아이유"); 
		
		System.out.println(s1); // 아이유 -> 변경되지 않음.
		StringBuffer sb = new StringBuffer("아이유");
		System.out.println(sb.append("짱")); // 기존의 문자열을 변결;
		System.out.println(sb);
		
		System.out.println(s1.length()); // 길이 3
		System.out.println(s1.indexOf("유")); // 0 1 2
		System.out.println(s1.indexOf("z")); // 관계 없는 수는 -1
		System.out.println(s1.charAt(2)); // 이
		System.out.println(s1.substring(1)); // 이유
		System.out.println(s1.substring(0, 2)); // 아이
		System.out.println(s1.startsWith("아")); // true
		System.out.println(s1.startsWith("아이")); // true
		System.out.println(s1.startsWith("야")); // false
		System.out.println(s1.endsWith("유")); // true
		System.out.println(s1.endsWith("이유")); // true

		String s2 = " 아이유";
		System.out.println(s1.equals(s2)); // false
		String s3 = s2.trim();
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s3));
		
		String s4 = "아이유, 소녀시대, 티아라";
		// 지정한 문자열 기준으로 분리하여 배열로 리턴하는 split
		String sa[] = s4.split(", ");
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
	}
}