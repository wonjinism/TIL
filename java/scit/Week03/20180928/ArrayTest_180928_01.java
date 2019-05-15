import java.util.Scanner;
public class ArrayTest_180928_01 {
	public static void main(String[] args) {
		System.out.println("배열 값 합계 구하기");
		/* 문제 : 배열의 갯수를 입력받아 배열을 생성하고
				각 배열의 값을 입력받아 저장한 후,
				배열에 들어있는 전체 값들의 합계를 구하여 출력한다.*/
		Scanner input = new Scanner(System.in);
		int arrayLength = 0;
		while (true) {
			System.out.print("배열의 갯수 : ");
			arrayLength = input.nextInt();
			if (arrayLength > 2) {
				break;
			} 
			System.out.println("2 이상의 값을 입력하세요.");
		}
		int[] arrSum = new int[arrayLength];
		for (int i = 0; i < arrSum.length; i++) {
			System.out.print("배열[" + i + "] : ");
			arrSum[i] = input.nextInt();
		}	
		int sum = 0;
		for (int i = 0; i < arrSum.length; i++) {
			System.out.print(arrSum[i]);
			sum += arrSum[i];
			if ( i < arrSum.length - 1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
	}
}