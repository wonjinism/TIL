import java.util.Scanner;

public class ArrayTest_181011_02 {
	public static void main(String[] args) {
		// 배열을 이용하여 날짜를 기억시킨 후
		int []month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 실행결과 : 
		// 원하는 달 : 3
		// 3월은 31일입니다.
		Scanner input = new Scanner(System.in);
		System.out.print("원하는 달 : ");
		int i = input.nextInt();
		System.out.println(i + "월은 " + month[i-1] + "입니다." );
	}
}