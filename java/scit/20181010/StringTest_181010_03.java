import java.util.Random;

public class StringTest_181010_03 {
	public static void main(String[] args) {
		// 0-99
		System.out.println((int)(Math.random() * 100)); // double로 표현할 수 있는 0.00 초과 ~ 1.00 미만 소수
		Random r = new Random();
		System.out.println(r.nextInt(100));
		// 1-100
		System.out.println((int)(Math.random() * 100 + 1));
		// 0-5
		System.out.println((int)(Math.random() * 6));
		// 1-6
		System.out.println((int)(Math.random() * 6 + 1));
		// 3-8
		System.out.println((int)(Math.random() * 6 + 3));
		
		// abs()
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-3.14));
		// floor & ceil & round // 내림, 올림, 반올림
		System.out.println(Math.floor(3.14));
		System.out.println(Math.floor(3.9));
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.ceil(3.9));		
		System.out.println(Math.round(3.499999));
		System.out.println(Math.round(3.5));
		System.out.println(Math.round(3.500001));
		// min & max
		System.out.println(Math.min(3.14, 3.14159));
		System.out.println(Math.max(3.14,  3.14159));
		System.out.println(Math.min(-10, -11));
		System.out.println(Math.max(-10, -11));
		// pow & sqrt
		System.out.println(Math.pow(5, 2)); // 제곱
		System.out.println(Math.sqrt(25)); // 루트
	}
}

