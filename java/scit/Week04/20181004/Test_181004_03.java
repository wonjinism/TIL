/*
정수 10개를 입력받아, 그 값들의 평균과 10 이상 차이나는 정수들을 출력한다.
*/
import java.util.Scanner;
public class Test_181004_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열[" + i + "] : ");
			arr[i] = input.nextInt();
			sum += arr[i];
		}
		avg = (double)sum / arr.length;
		System.out.println();
		System.out.println("평균 : " + avg);
		System.out.print("평균과 10 이상 차이나는 수 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg + 10 || arr[i] < avg - 10) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
