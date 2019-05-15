import java.util.Scanner;

public class ArrayTest_181011_03 {
	public static void main(String[] args) {
		// 좌석이 10개인 도서관 예약 시스템
		// 조건1. 사용자가 좌석을 예약하려하면 현재의 좌석 배치표를 보여준다.
		// 조건2. 예약된 좌석은 "예약 불가능", 예약되지 않은 좌석은 "예약 가능"으로 표시한다.
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		int select;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		while (true) {
			System.out.println("현재 좌석 현황");
			for (int i = 0; i < arr.length; i++) {
				if (i < 9) {
					System.out.print("  ");
				}
				if (arr[i] == 0) {
					System.out.println(i + 1 + "번째 좌석 : " + "예약 가능" );
				} else {
					System.out.println(i + 1 + "번째 좌석 : " + "예약 불가능" );
				}
			}
			System.out.println();
			System.out.print("예약을 원하는 좌석번호(1-10): ");
			select = input.nextInt();
			if (arr[select -1] == 1) {
				System.out.println("이미 예약된 좌석입니다.");
				System.out.println();
			} else {
				arr[select-1] = 1;
				System.out.println();
			}
		}
	}
}
