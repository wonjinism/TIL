public class Test01 {
	public static void main(String[] args) {		
		// 컴파일 에러 발생하는 표현식 찾기
		boolean a = true & true;
		int b = 4 & 5;
//		int c = 0 > 3; 
//		float d = 40.0; // 소수인 경우 f로 캐스팅 해주어야 한다.
//		boolean e = (boolean) 1; // int는 boolean으로 변형할 수 없다.

		// float의 올바른 선언 찾기
		// f의 역할 : 소수점을 입력하면 기본적으로 double로 인식하기 때문에 float일 때는 f를 뒤에 붙여서 캐스팅해주는 역할
		float foo1 = -1;
//		float foo2 = 1.0; // f가 없어서
//		float foo3 = 42el; // 42e 뒤에 l을 붙여서 틀림
		float foo4 = 2.02f;
//		float foo5 = 3.03d; // f 대신 d가 붙어서
		float foo6 = 0x0123; // 16진수

		// 에러가 발생하는 표현식
		char cha1 = '\n'; // 개행
//		char cha2 = "\0";
		char cha3 = '\r'; // 캐리지 리턴 (사용하지는 않음)
//		char cha4 = '\c';

		// 컴파일 시 에러가 발생하는 행
		float fl1 = 1;
		float fl2 = 1L; // 정수일 때는 int로 인식하기 때문에 끝에 l을 붙여서 long 타입으로 캐스팅해주는 역할 // float이 long타입 보다 크기 때문에 가능?
		float fl3 = 1.0f;
//		float fl4 = 1.0; // 소수인데 f가 들어가지 않아서
	}
}