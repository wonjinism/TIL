package step02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, select;
		Calculator cal = new Calculator();
		
		while(true) {
			System.out.println("==============");
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("5. 종료");
			System.out.println("==============");
			
			select = sc.nextInt();
			if (select == 5) {
				System.out.println("수고하셨습니다.");
				break;
			}					
			
			System.out.println("첫번째 수를 입력해주세요:");
			a = sc.nextInt();
			System.out.println("두번째 수를 입력해주세요:");
			b = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println(cal.add(a, b));
				break;
			case 2:
				System.out.println(cal.minus(a, b));
				break;
			case 3:
				System.out.println(cal.multiplier(a, b));
				break;
			case 4:
				System.out.println(cal.divide(a, b));
				break;
			default:
				break;
			}		
		}
	}
}
