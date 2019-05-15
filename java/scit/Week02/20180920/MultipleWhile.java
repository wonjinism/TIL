import java.util.Scanner;
class MultipleWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("어떤 숫자까지? ");
		int limit = input.nextInt();
		System.out.print("몇 배로? (2배 이상) ");
		int multiple = input.nextInt();
		int output = 1;
		while ( output <= limit)
		{
			System.out.print(output + " ");
			output = output * multiple;
		}
		System.out.println();
	}
}