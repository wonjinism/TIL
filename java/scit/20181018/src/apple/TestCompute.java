package apple;

import java.util.Scanner;

public class TestCompute {

	public static void main(String[] args) {
		// 값을 입력받아 메서드 호출하여 처리
		// 조건1. 입력받은 값을 compute(item, qty, price)에서 처리
		// 조건2. 계산방법 : 금액 = 수량 X 단가
		//실행결과 :
		//-입력-
		//품명 : apple
		//수량 : 10
		//단가 : 12000
		//
		//-출력-
		//품명:apple
		//금액:120000
		
		Scanner input = new Scanner(System.in);
		System.out.println("-입력-");
		System.out.print("품명 : ");

		String a = input.nextLine();
		System.out.print("수량 : ");
		int b = input.nextInt();
		System.out.print("단가 : ");
		int c = input.nextInt();
		System.out.println();


		System.out.println("-출력-");
		Calc A1 = new Calc();
		A1.compute(a, b, c);		
		
		
		
	}

}
