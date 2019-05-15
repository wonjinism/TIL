import java.util.Scanner;
public class LoopCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("계산기 프로그램!");
		double x;
		int y; 
		String op; // 4칙 연산자
		double result = 0;
		int loopCheck = 0;
		boolean startCheck = true;

	while ( loopCheck == 0) {
		if ( startCheck == true) { 
			System.out.print("피연산자 : ") ;
			x = input.nextInt();
			input.nextLine(); // 위 nextInt() 입력 시 enter 값을 버리기 }
		} else {
			x = result;
			System.out.println("피연산자 : " + x);
			input.nextLine(); // 위 nextInt() 입력 시 enter 값을 버리기 }
		}
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
			result = x / (double)y;
			System.out.println(x + " " + op + " " + y + " = " + result);
			break;
		default :
			System.out.println("사칙연산자를 잘못 입력하셨습니다.");
			break;
		}
		startCheck = false;
		System.out.print("이어서 계산하시겠습니까?(0) : ");
		loopCheck = input.nextInt();
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