import java.util.Scanner;

public class ArrayTest_181011_01 {
	public static void main(String[] args) {
//		배열의 길이를 입력 받은 후 
//		배열의 길이만큼 데이터를 입력받아 평균을 출력
//		실행 결과 :
//		입력1 : 34.5
//		입력2 : 15
		Scanner input = new Scanner(System.in);
		int len;
		double sum = 0;
		
		System.out.print("배열의 길이 : ");
		len = input.nextInt();
		double arr[] = new double[len];
		for (int i = 0; i < len; i++) {
			System.out.print("입력" + (i + 1) + " : ");
			arr[i] = input.nextDouble();
			sum += arr[i];
		}
		System.out.println("평균은 " + sum / len +"입니다.");
	}
}
