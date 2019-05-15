public class StringTest_181010_02 {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("length : " + str.length());
		
		System.out.println(str.replace('l', 't')); // Hetto
		System.out.println(str.substring(2)); // llo // 3번째부터 나열
		System.out.println(str.substring(2,  4)); // ll // 3번째부터 4번째까지 나열 
		
		System.out.println(str.indexOf("he")); // -1 // 대소문자 구분함
		System.out.println(str.indexOf("he", 1)); // -1 // 2번째부터 나열한 다음에 그 안에 첫 변수의 글자가 있는지 확인
		System.out.println(str.indexOf('l')); // 2 // 
		
		System.out.println(str.lastIndexOf('l', 4)); // 3 // Hello
		System.out.println(str.lastIndexOf('l', 2)); // 2 // 
		System.out.println(str.lastIndexOf('h', 1)); // -1 // 
		
		String str1 = "mad dog"; 
		String str2 = "mad cat";
		
		System.out.println(str2.compareTo(str1)); // -1
		System.out.println(str1.compareTo(str2)); // 1 
	}
}