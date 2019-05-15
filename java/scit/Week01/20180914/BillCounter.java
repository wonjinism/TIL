import java.util.Scanner;
class BillCounter
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int inputPrice;
		int unitGoman = 50000;
		int unitIchiman = 10000;
		int unitGozen = 5000;
		int unitSen = 1000;
		int countGoman;
		int countIchiman;
		int countGozen;
		int countSen;
		int countChange;
		int remain;

		System.out.println("상품가격을 입력하세요 :");
		inputPrice = input.nextInt();
		remain = inputPrice;
		
		countGoman = remain / unitGoman;
		remain -= countGoman * unitGoman;

		countIchiman = remain / unitIchiman;
		remain -= countIchiman * unitIchiman;

		countGozen = remain / unitGozen;
		remain -= countGozen * unitGozen;

		countSen = remain / unitSen;
		remain -= countSen * unitSen;
		
		countChange = remain;

		System.out.println(inputPrice + "원은 5만원권 " + countGoman + "장, 만원권 " + countIchiman + "장, 5천원권 " + countGozen + "장, 천원권 " + countSen + "장을 지불하고 " + countChange + "원이 남습니다.");
	}
}