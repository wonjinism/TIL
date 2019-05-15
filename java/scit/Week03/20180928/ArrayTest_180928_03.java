public class ArrayTest_180928_03 {
	public static void main(String[] args) {
	// 문제 : 유니코드 41 - 122까지의 코드와 문자를 한 줄에 8개씩 출력한다.
	// char 형은 정수형이다. 예를 들어 문자 'A'는 유니코드값인 65(10진수의 경우)로 저장된다.
	// 실행결과 : 
	// 41:)		42:*	43:+	44:,	45:=	45:
		int count = 0;
		for (int i = 41; i <=122; i++) {
			if (i < 100) {
				System.out.print(" ");
			}
			System.out.print(i + ":" + (char)i + "\t");
			count++;
			if (count % 8 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
