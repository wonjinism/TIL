import java.util.Scanner;
class AddTenTimes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num; 
		for (int i = 1; i <= 10; i++ ) {
			System.out.print("정수 입력 : ");
			num = input.nextInt();
			sum += num;
		}
		System.out.println();
		System.out.println("합계 : " + sum);
	}
}