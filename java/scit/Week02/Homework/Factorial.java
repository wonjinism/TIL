import java.util.Scanner;
class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i;
		int num = input.nextInt();
		long output = 1l; 
		for (i = 1; i <= num; i++) {
			output *= i;
		}
		System.out.println(i + "! = " + output );
	}
}