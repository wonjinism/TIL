import java.util.Scanner;
public class CalculatorFour {
	public static void main(String[] args) {
		System.out.println("계산기 프로그램!");
		int x, y; 
		String op; // 4칙 연산자
		int result;

		Scanner input = new Scanner(System.in);	
		System.out.print("피연산자 : ");
		x = input.nextInt();
		input.nextLine(); // 위 nextInt() 입력 시 enter 값을 버리기
		System.out.print("계산기호(+-*/) : ");
		op = input.nextLine(); 
		System.out.print("연산자 : ");
		y = input.nextInt();

		switch (op) {
		case "+" :
			result = x + y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		case "-" :
			result = x - y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		case "*" :
			result = x * y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		case "/" :
			float resultFloat = x / (float)y;
			System.out.println(x + " " + op + " " + y + " = " + resultFloat);
			break;
		default :
			System.out.println("사칙연산자를 잘못 입력하셨습니다.");
			break;
		}
/*
		if ( op == "+" ) {
			result = x + y;
			System.out.println(x + op + y + " = " + result);
		} else if ( op == "-" ) {
			result = x - y;
			System.out.println(x + op + y + " = " + result);
		} else if ( op == "*" ) {
			result = x * y;
			System.out.println(x + op + y + " = " + result);
		} else if ( op == "/") {
			float resultFloat = x / (float)y;
			System.out.println(x + op + y + " = " + resultFloat);
		} else {
			System.out.println("사칙연산자를 잘못 입력하셨습니다.");
		}
*/
	}
}