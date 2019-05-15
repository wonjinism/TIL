/* 
	2개의 정수를 입력받아 작은 수부터 큰수까지의 합을 출력하세요.
	
	실행결과 :
	첫번째 숫자를 입력해주세요 : 1
	두번째 숫자를 입력해 주세요 : 10
	55

	실행결과 :
	첫번째 숫자를 입력해주세요 : 5
	두번째 숫자를 입력해 주세요 : 1
	15
*/
import java.util.Scanner;
public class Test_181002_04 {
	public static void main(String[] args) {
		System.out.println("제어문과 반복문");
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int a = input.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int b = input.nextInt();
		int sum = 0;
		if (a < b) {
			for (int i = a; a <=b; a++) {
				sum += a;
			}
		} /* else if (a == b) {
			sum = a + b; 
		} */else {
			for (int i = b; b <=a ; b++) {
				sum += b;
			}
		}
		System.out.println(sum);
	}
}