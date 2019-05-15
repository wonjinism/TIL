import java.util.Scanner;
public class Test_181001_02 {
	public static void main(String[] args) {
		System.out.println("메뉴번호 및 메뉴명을 입력받아서 출력하기");
		// 실행화면 : 
		// 번호를 선택하시오
		// 1. 메뉴등록, 2. 출력, 0. 종료;
		// 번호 : 
		// 등록할 메뉴를 입력하세요
		// 메뉴명 :
		// 가격을 등록해 주세요
		// 가격 : 
		
		// * 2. 출력 시
		// 메뉴명 : 가격\n
		// * 메뉴는 최대 3개 
		// 더이상 등록할 수 없습니다.
		// * 0. 종료 입력 시 프로그램 종료
		Scanner input = new Scanner(System.in);
		int select;
		int menuNum = 0;
		String menuName;
		int menuPrice;
		String[] listMenuName = new String[3];
		int[] listMenuPrice = new int[3];
		
		while (true) {
			System.out.println("메뉴를 선택하시오");
			System.out.println("1. 메뉴등록, 2. 출력, 0. 종료");
			System.out.print("번호 : ");
			select = input.nextInt();
			input.nextLine();
			if (select == 0) {
				System.out.println("(프로그램 종료)");
				break;
			}
			switch (select) {
				case 1 : 
					if (menuNum >= 3) {
						System.out.println("더이상 등록할 수 없습니다.");
						System.out.println();
						break;
					}
					System.out.println("등록할 메뉴를 입력하세요");
					System.out.print("메뉴명 : ");
					menuName = input.nextLine();
					System.out.println("가격을 등록해 주세요");
					System.out.print("가격 : ");
					menuPrice = input.nextInt();

					listMenuName[menuNum] = menuName;
					listMenuPrice[menuNum] = menuPrice;
					menuNum++;
					System.out.println();
					break;
				case 2 : 
					if (menuNum == 0) {
						System.out.println("메뉴가 입력되어 있지 않습니다.");
						System.out.println();
						break;
					}
					for (int i = 0 ;i < menuNum; i++) {
						System.out.println(listMenuName[i] + " : " + listMenuPrice[i]);
					}
					System.out.println();				
					break;
				default :
					System.out.println("잘못 입력했습니다. 다시 입력해 주세요.");
					System.out.println();
			} 
		}
	}
}