package sesoc.global.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import sesoc.global.manager.SaleManager;
import sesoc.global.vo.DeliveryOrder;
import sesoc.global.vo.Food;
import sesoc.global.vo.Order;
import sesoc.global.vo.StoreOrder;

public class RestaurantUI implements UI {
	Scanner scanner = new Scanner(System.in);
	SaleManager sm = new SaleManager();
	List<Food> foodList = null;

	public RestaurantUI() {
		foodList = sm.getFood();
		boolean loop = true;
		while (loop) {
			printMainMenu();
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				insertOrder(); // 주문 방식 선택
				break;
			case 2:
				System.out.print(" > 취소할 주문번호 입력 : ");
				sm.deleteOrder(scanner.nextInt() - 1);
				break;
			case 3:
				sm.showAll();
				break;
			case 9:
				sm.saveFile();
				loop = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				break;
			}
		}
	}

	@Override
	public void insertOrder() {
		Order insertOrder = null;
		while (true) {
			printOrderMenu();
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println();
				printFoodList(foodList);
				sm.insertOrder(makeOrder("1"));
				break;
			case 2:
				System.out.println();
				printFoodList(foodList);
				sm.insertOrder(makeOrder("2"));
				break;
			case 9:
				System.out.println();
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println();
				break;
			}
		}
	}

	@Override
	public void deleteOrder() {

	}

	@Override
	public void printMainMenu() {
		System.out.println("==================================");
		System.out.println("  [ SCIT Restaurant 매상 관리 시스템 ]");
		System.out.println("==================================");
		System.out.println("1. 주문");
		System.out.println("2. 주문 취소");
		System.out.println("3. 당일 매출 정산 출력");
		System.out.println("9. 종료");
		System.out.println("==================================");
		System.out.print("** 메뉴 번호 선택 : ");
	}

	@Override
	public void printOrderMenu() {
		System.out.println("==================================");
		System.out.println("         [ SCIT 음식 주문]");
		System.out.println("==================================");
		System.out.println("1. 매장 주문");
		System.out.println("2. 배달 주문");
		System.out.println("9. 상위로");
		System.out.print("** 주문 방식 : ");
	}

	@Override
	public Order makeOrder(String orderType) {
		Order returnOrder = null;

		switch (orderType) {
		case "1":
			Map soMap = new HashMap();
			System.out.print(" > 테이블 번호 : ");
			int tableNo = scanner.nextInt();
			
			boolean soLoop = true;
			while(soLoop) {
				String input = null;
				int foodNum = 0;
				int foodCount = 0;
				System.out.print(" > 주문할 메뉴 (입력이 끝나면 0) : ");
				input = scanner.next();
				if (input.equals("0")) {
					soLoop = false;
				} else {
					foodNum = Integer.parseInt(input);
					if (foodNum >= 1 && foodNum <= 12) {
						System.out.print(" > 개수 : ");
						foodCount = scanner.nextInt();
						soMap.put(foodList.get(foodNum - 1),foodCount);						
					} else {
						System.out.println("잘못 입력했습니다.");	
					}	
				}
			}
			returnOrder = new StoreOrder(tableNo,soMap);
			break;
		case "2":
			Map doMap = new HashMap();
			
			System.out.print(" > 주문자 전화번호 : ");
			String buyerPhone = scanner.next();
			System.out.print(" > 주문자 주소 : ");
			String buyerAddress = scanner.next();
			
			boolean doLoop = true;
			while(doLoop) {
				String input = null;
				int foodNum = 0;
				int foodCount = 0;
				System.out.print(" > 주문할 메뉴 (입력이 끝나면 0) : ");
				input = scanner.next();
				if (input.equals("0")) {
					doLoop = false;
				} else {
					foodNum = Integer.parseInt(input);
					if (foodNum >= 1 && foodNum <= 12) {
						System.out.print(" > 개수 : ");
						foodCount = scanner.nextInt();
						doMap.put(foodList.get(foodNum - 1),foodCount);
					} else {
						System.out.println("잘못 입력했습니다.");	
					}	
				}
			}
			returnOrder = new DeliveryOrder(buyerPhone,buyerAddress,doMap);
			break;
		default:
			break;
		}
		return returnOrder;
	}

	@Override
	public void printFoodList(List<Food> foodList) {
		System.out.println("============== 주문 가능한 메뉴 =============");
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i).toString());
		}
		System.out.println("=======================================");
		System.out.println();
	}

	@Override
	public int foodOrdered(Map<Food, Integer> map) {
		// TODO Auto-generated method stub
		return 0;
	}
}