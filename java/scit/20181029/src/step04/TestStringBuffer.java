package step04;

public class TestStringBuffer {
	public static void main(String[] args) {
		// StringBuffer 문자열 자체가 변경되는 객체
		StringBuffer sb = new StringBuffer("아이유");
		System.out.println(sb.append("짱"));
		System.out.println(sb); // 아이유짱
		
		StringBuffer sb1 = new StringBuffer("아이유짱");
		System.out.println(sb == sb1); // 주소값이 다르므로 false
		// StringBuffer는 오버라이딩 하지 x -> Object의 equals와 == 동일
		System.out.println(sb.equals(sb1));
		
		System.out.println(sb.toString().equals(sb1.toString()));
		System.out.println(sb.replace(0, 2, "우"));		
		System.out.println(sb.delete(0, 2)); // 두 번째 인덱스 번호의 앞까지 자른다.
		StringBuffer sb2 = new StringBuffer("뻐이 장가 가네");
		System.out.println(sb2.reverse());
	}
}