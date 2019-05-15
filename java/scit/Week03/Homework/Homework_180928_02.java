// 2. n개의 정수를 가진 입력받아 배열을 만든다. 
//    이 배열은 양의 정수와 음의 정수를 모두 가지고 있어야한다.
//    당신은 이 배열을 특별한 방법으로 정렬해야한다. 그 방법은 아래와 같다.
//    음의 정수는 앞쪽에 양의 정수는 뒷쪽에 있어야하며, 
//    양의 정수와 음의 정수의 순서에는 변함이 없어야한다.
// 실행 화면 : 
// -1 1 3 -2 2 ans -1 -2 1 3 2

import java.util.Scanner;
public class Homework_180928_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("배열의 칸수 입력 : ");
		int array_length = input.nextInt();
		int[] arr = new int[array_length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열[" + i + "] = ");
			arr[i] = input.nextInt();
		}
		// 음수를 찾아서 음수가 아닌 수부터 옆으로 다 밀어내면서 넣는다. 최대 n/2만큼 밀어낼듯?
		int temp = 0;
		int moveTo = 0; // 음수를 옮겨줄 위치
		for (int i = 0; i < arr.length; i++) {
			if (i == moveTo && arr[i] < 0) { // 이미 음수일 때 다음으로 위치로 이동
				moveTo++;
			}

			else if (i != moveTo && arr[i] < 0) {
				temp = arr[moveTo];
				arr[moveTo] = arr[i];
				
				for (int j = i; j > moveTo + 1; j--) { // 뒤로 밀기
					arr[j] = arr[j -1];
				}
				arr[moveTo + 1] = temp;
				moveTo++;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}
}