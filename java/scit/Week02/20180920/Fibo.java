import java.util.Scanner;
public class Fibo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇까지 숫자? ");
		int limit = input.nextInt();
		int mae = 0;
		int ima = 1;
		int output;
		for (output = 1; output <= limit; output = mae + ima) {
			System.out.print(output + " ");
			mae = ima;
			ima = output;
		}
		System.out.println();
	}
}