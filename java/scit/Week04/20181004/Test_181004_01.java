/* 
원 단위의 금액을 입력받아 달러, 엔화 또는 유로화 단위로 금액을 계산한다.

조건
	1000원은 0.9달러, 102엔 또는 0.78유로로 계산한다.
	입력 금액이 음수이거나, 계산할 화폐 단위를 잘못 입력하면 에러 메시지를 출력하고 종료한다.
*/
import java.util.Scanner;
public class Test_181004_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int insert = 0;
		int select = 0;

		System.out.print("원 단위 금액 입력 : ");
		insert = input.nextInt();
		if (insert < 1) {
			System.out.println();
			System.out.println("잘못 입력했습니다.");
		} else { 
			System.out.print("환전할 화폐 (1:달러, 2:엔화, 3:유로화) : ");
			select = input.nextInt();
			switch (select) {
				case 1 : 
					System.out.println();
					System.out.println(insert + "원은 " + insert * 0.0009 + "달러입니다.");
					break;
				case 2 : 
					System.out.println();
					System.out.println(insert + "원은 " + insert / 1000 * 102 + "엔입니다.");
					break;
				case 3 : 
					System.out.println();
					System.out.println(insert + "원은 " + insert * 0.00078 + "유로입니다.");
					break;
				default :
					System.out.println();
					System.out.println("잘못 입력했습니다.");
			}
		}
	}
}