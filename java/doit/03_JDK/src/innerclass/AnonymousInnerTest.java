package innerclass;

class Outer2 {
	Runnable gettRunnable(int i) {
		int num = 100;
		
		return new Runnable() { // 이름을 빼고 익명으로 Runnable 인터페이스 생성
			public void run() {
//				num = 200;
//				i = 10;
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner = new Runnable() {// 익명 내부 클래스를 변수에 대입
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스");
		} 
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble = out.gettRunnable(100);
		runnerble.run();
		out.runner.run();
	}
}
