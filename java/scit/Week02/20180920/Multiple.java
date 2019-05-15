import java.util.Scanner;
public class Multiple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇까지 숫자? ");
		int limit = input.nextInt();
		System.out.print("몇 배로 증가? (2배 이상) ");
		int multiple = input.nextInt();
		int ima = 1;
		int output;
		for (output = 1; output <= limit; output = ima * multiple) {
			System.out.print(output + " ");
			ima = output;
		}
		System.out.println();
	}
}