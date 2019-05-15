package game2;

import java.util.Scanner;

public class NumbersGame {

	public static void main(String[] args) {
		// 숫자맞추기 게임
		// 0~100 사이의 임의의 수를 하나 생성
		// 실행결과 :
		// 숫자입력(0~100) : 50
		// 크다
		//
		// 숫자입력(0~100) : 60
		// 작다
		//
		// 숫자입력(0~100) : 55
		// 맞았다(3번)
		//
		// 계속(y/n) : y
		// 숫자입력(0~100) : 60

		Scanner scanner = new Scanner(System.in);
		int a = (int) (Math.random() * 100) + 1; // 랜덤수
		int num = 0;
		int count = 0;

		for (;;) {
			System.out.print("숫자입력(0~100) : ");
			num = scanner.nextInt();
			if (a > num) {
				System.out.println("크다");
				count += 1;
				continue;
			} else if (a < num) {
				System.out.println("작다");
				count += 1;
				continue;
			} else {
				count += 1;				
				System.out.println("맞았다(" + count + "번)");
				break;
			}
		}
		
		
	}
}
/*System.out.print("계속하시겠니?(y/n) : ");
String y = input.nextLine();

if (y == "y") {
	continue;
} else {
	break;
}
*/