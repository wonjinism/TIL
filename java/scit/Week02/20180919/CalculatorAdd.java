import java.util.Scanner;
class CalculatorAdd
{
	public static void main(String[] args) {
		System.out.println("덧셈 프로그램!");
		Scanner inputValue = new Scanner(System.in);
		System.out.print("피연산자 : ");
		int x = inputValue.nextInt();
		System.out.print("연산자 : ");
		int y = inputValue.nextInt();
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
		System.out.println("계속 하시겠습니까?");
	}
}