package innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
//		static int sInNum = 200; // 인스턴스 내부 클래스에 정적 변수 선언 불가능
		
		void inTest() {
			System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수)");
		}
		
//		static void sTest() { } // 정적 메서드 역시 정의 불가능. 요류가 발생하므로 주석 처리
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석처리
			System.out.println("InStaticClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수 사용)");
		}
		
		// 정적 내부 클래스의 정적 메서드
		static void sTest() {
//			num += 10;
//			inNum += 10;
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum =" + sInNum + " (내부 클래스의 정적 변수 사용)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		// 인스턴스 내부 클래스 예제
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println();
		
		// 정적 내부 클래스 예제
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); // 외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성 가능
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
		
	}
}
