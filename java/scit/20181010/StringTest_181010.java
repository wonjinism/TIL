public class StringTest_181010 {
	public static void main(String[] args) {
		// String 제어
		String a = "ABCDEFG";
		System.out.println(a);
		String b = new String("ABCDEFG");
		System.out.println(b);
		// equals 값을 비교
		System.out.println(a.equals(b));
		String c = "abcdefg";
		System.out.println(a.equals(c));
		// indexOf()
		System.out.println(a.indexOf("A"));
		System.out.println(a.indexOf("E"));
		System.out.println(a.indexOf("H")); // 존재하지 않으면 -1을 출력
		String d = "ABCDCBA";
		System.out.println(d.indexOf("A")); // 여러개가 있을 경우 첫 번째 것을 출력
		// substring() 특정 구간 출력
		System.out.println(a.substring(4)); // 4부터 나머지를 출력
		System.out.println(a.substring(4, 5));	 // 4부터 5 이전까지 출력
		System.out.println(a.substring(a.indexOf("E"), a.indexOf("E")+1));
		// replaceAll() 찾아바꾸기
		System.out.println(a.replaceAll("EFG", "JAVA"));
		String s = "HelloWorld";
		System.out.println(s);;
		System.out.println(s.replace('l',  'o'));
		// toUpperCase & toLowerCase 대소문자 변환
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//concat();
		String x = "ABC";
		String y = "DEF";
		String z = x + y;
		System.out.println(z);
		System.out.println(x.concat(y));
		
		// isEmpty() 공백 여부 확인
		System.out.println(s.isEmpty());
		String e = "";
		System.out.println(e.isEmpty());
	}
}

// 테스트 해봤는데 인덱스는 동일한 값이 있을 경우 첫 값의 위치만 출력하는데.
//범위를 지정해서 할 수 있는가