package game;

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

		Scanner Input = new Scanner(System.in);
		int a = (int)(Math.random() * 100) + 1; // 랜덤수
		Answer ans = new Answer();
		String reply;
		
		for (;;) {
			System.out.print("숫자입력(0~100) : ");
			int num = Input.nextInt();
			
			reply = ans.Measure(num, a);
			if(reply=="A" || reply=="B") {
				continue;
			}
			
			System.out.print("계속하시겠니?(y/n) : ");
			String y = Input.next();
			
			if (y.equals("y")) {
				continue;
			} else {
				break;
			}
		}
	}
}
