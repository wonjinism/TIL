import java.util.Scanner;
class ChangeCounter
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int price;
		int receiveMoney;
		int change;

		System.out.println("상품금액을 입력하세요 : ");
		price = input.nextInt();
		System.out.println("받은 돈을 입력하세요 : ");
		receiveMoney = input.nextInt();
		change = price - receiveMoney;
		System.out.println("거스름돈은 " + change + "입니다.");
	}
}