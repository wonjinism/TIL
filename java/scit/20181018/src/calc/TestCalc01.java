package calc;

public class TestCalc01 {
	public static void main(String[] args) {
		// main매서드에서 각각 호출하고 계산된 결과를 return 받아 main 매서드에서 출력
		// 호출함수 : sum(3,5) sub(7,2) mul(4,5) div(7,3) -> 숫자는 임의
		// 실행결과 :
		// 더하기 : 8
		// 빼기 : 5
		// 곱하기 : 20
		// 나누기 : 2.3333333

		Calculation calc = new Calculation();
		int result_sum = calc.sum(3, 5);
		int result_sub = calc.sub(7, 2);
		int result_mul = calc.mul(4, 5);
		double result_div = calc.div(7, 3);

		System.out.println("더하기 : " + calc.sum(3, 5));
		System.out.println("빼기 : " + calc.sub(7, 2));
		System.out.println("곱하기 : " + calc.mul(4, 5));
		System.out.println("나누기 : " + calc.div(7, 3));

		Calculation calc2 = new Calculation(10, 20);
		System.out.println("더하기 : " + calc2.sum2(calc2));
		System.out.println("빼기 : " + calc2.sub2(calc2));
		System.out.println("곱하기 : " + calc2.mul2(calc2));
		System.out.println("나누기 : " + calc2.div2(calc2));
	}
}