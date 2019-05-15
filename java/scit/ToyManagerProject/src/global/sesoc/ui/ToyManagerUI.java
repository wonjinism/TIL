package global.sesoc.ui;

import java.util.List;
import java.util.Scanner;

import global.sesoc.manager.ToyManagerMgr;
import global.sesoc.vo.Bicycle;
import global.sesoc.vo.Drone;
import global.sesoc.vo.GameConsole;
import global.sesoc.vo.Toy;

public class ToyManagerUI {
	Scanner input = new Scanner(System.in);
	ToyManagerMgr manager = new ToyManagerMgr();

	/**
	 * 생성자
	 */
	public ToyManagerUI() {
		int mNum = 0;

		while (true) {
			try {
				mainMenu();
				mNum = input.nextInt();

				switch (mNum) {
				case 1:
					insertToy();
					break;
				case 2:
					searchToy();
					break;
				case 3:
					deleteToy();
					break;
				case 4:
					searchForPrice();
					break;
				case 5:
					printToyInfo();
					break;
				case 9: // 저장 후 끝냄
					System.out.println("데이터 저장 후 프로그램 종료합니다.");
					manager.saveFile();
					return;
				}
			} catch (Exception e) {
				System.out.println("오류 >>>>> 다시 입력해 주세요.");
				input.nextLine();
				continue;
			}
		}

	}

	/**
	 * 주메뉴를 화면에 출력한다.
	 */
	public void mainMenu() {
		System.out.println("\n===== Toy Manager ======");
		System.out.println("1. 장난감 등록");
		System.out.println("2. 장난감 검색");
		System.out.println("3. 장난감 삭제");
		System.out.println("4. 가격대 검색");
		System.out.println("5. 장난감 정보 출력");
		System.out.println("9. 종료");
		System.out.println("=======================");
		System.out.print("[ 메뉴  선택  ] ");
	}

	/**
	 * 장난감 추가를 위해 메뉴를 호출하고 해당 메뉴에 대한 선택을 입력받은 후 Toy 객체를 생성하는 makeToy() 메서드를 호출 한 후
	 * 리턴된 Toy 객체를 List에 삽입한다.
	 */

	public void insertToy() {
		while (true) {
			try {
				int select = 0;
				insertMenu();
				select = input.nextInt();
				switch (select) {
				case 1:
				case 2:
				case 3:
					Toy makeToy = makeToy(select);
					boolean result = manager.insertToy(makeToy);
					if (result == false) {
						System.out.println("[ 이미 등록된 고유번호 ]");
					} else {
						System.out.println("[ 등록 성공 ]");
					}
					break;
				case 9:
					return;
				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("오류 >>>>> 다시 입력해 주세요.");
				input.nextLine();
				continue;
			}
		}

	}

	/**
	 * 장난감 객체를 등록하기 위한 메뉴를 화면에 출력
	 */
	public void insertMenu() {
		System.out.println("\n===== 장난감 등록 메뉴 =====");
		System.out.println("1. 자전거");
		System.out.println("2. 드론");
		System.out.println("3. 게임기");
		System.out.println("9. 상위메뉴");
		System.out.print("[ 장난감 선택 ] ");
	}

	public Toy makeToy(int toyType) {
		Toy toy = null;
		String name, serialNum;
		int price = 0;

		while (true) {
			try {
				System.out.print("> 고유번호:");
				serialNum = input.next();
				System.out.print("> 이름:");
				name = input.next();
				System.out.print("> 가격:");
				price = input.nextInt();
				switch (toyType) {
				case 1:
					String type = null;
					while (true) {
						System.out.print("> 자전거 종류(1. 도로용, 2. 산악용) => ");
						int select = input.nextInt();
						if (select == 1) {
							type = "road";
							break;
						} else if (select == 2) {
							type = "mountain";
							break;
						} 
					}
					toy = new Bicycle(serialNum, name, price, type);
					break;
				case 2:
					System.out.print("> 드론(날개 갯수) => ");
					int wingCount = input.nextInt();
					toy = new Drone(serialNum, name, price, wingCount);
					break;
				case 3:
					boolean isPortable = true;
					while (true) {
						System.out.print("> 게임기(휴대가능 여부 y/n) => ");
						String check = input.next();
						if (check.equals("Y") || check.equals("y")) {
							break;
						} else if (check.equals("N") || check.equals("n")) {
							isPortable = false;
							break;
						}
					}
					toy = new GameConsole(serialNum, name, price, isPortable);
					break;
				default:
				}
				return toy;
			} catch (Exception e) {
				System.out.println("오류 >>>>> 다시 입력해 주세요.");
				input.nextLine();
				continue;
			}
		}
	}

	/**
	 * 고유번호에 해당하는 장난감을 검색하여 화면에 출력한다. 검색이 되지 않을 경우 메시지 출력
	 */
	public void searchToy() {
		while (true) {
			System.out.print("\n> 장난감 고유번호: ");
			String serialNum = input.next();
			Toy sToy = manager.searchToy(serialNum);

			if (sToy != null) {
				System.out.println(sToy.toString());
			} else {
				System.out.println("검색 실패 >>>>> 입력하신 고유번호의 장난감이 존재하지 않습니다.\n");
			}
			return;
		}
	}

	/**
	 * 장난감의 시리얼번호를 입력받아 해당하는 장난감 정보를 삭제한다.
	 */
	public void deleteToy() {
		System.out.println("\n===== 장난감 삭제 메뉴 =====");
		System.out.print("> 장난감 고유 번호: ");
		String serialNum = input.next();

		if (manager.deleteToy(serialNum)) {
			System.out.println("[ 삭제 성공 ]\n");
		} else {
			System.out.println("삭제 실패 >>>>> 입력하신 고유번호의 장난감이 존재하지 않습니다.\n");
		}
	}

	/**
	 * 가격대 검색 최소 가격과 최대 가격을 입력받아 해당하는 가격 범위 내의 모든 장난감을 검색해서 출력
	 */
	public void searchForPrice() {
		System.out.println("\n===== 가격 검색 메뉴 =====");

		System.out.print("> 최소가격: ");
		int minPrice = input.nextInt();

		System.out.print("> 최대가격: ");
		int maxPrice = input.nextInt();

		int count = 0;

		System.out.println("[ " + minPrice + "원 ~ " + maxPrice + "원 사이의 제품 검색 결과");
		List<Toy> searchForPrice = manager.toyListForPrice(minPrice, maxPrice);
		for (Toy toy : searchForPrice) {
			System.out.println(toy.toString());
			count++;
		}
		System.out.println("총 장난감 개수: [" + count + "] 대");
	}

	/**
	 * 장난감 정보를 화면에 출력 장난감 정보를 출력하고 난 후 검색한 장난감의 개수 출력 검색이 되지 않을 경우 등록된 장난감이 없다는 메시지
	 * 출력
	 */
	public void printToyInfo() {
		while (true) {
			printMenu();
			int pNum = input.nextInt();
			String msg = null;

			switch (pNum) {
			case 1:
				msg = "총 장난감 개수: [";
				break;
			case 2:
				msg = "총 자전거 대수: [";
				break;
			case 3:
				msg = "총 드론 대수: [";
				break;
			case 4:
				msg = "총 게임콘솔 대수: [";
				break;
			case 9:
				return;
			default:
				System.out.println("[ 메뉴를 다시 선택해 주세요. ] ");
				continue;
			}

			int count = 0;
			List<Toy> printToyInfo = manager.printToyInfo(pNum);
			if (printToyInfo.size() == 0) {
				System.out.println("등록된 장난감이 없습니다.");
			} else {
				for (Toy toy : printToyInfo) {
					System.out.println(toy.toString());
					count++;
				}
				System.out.println("총 장난감 개수: [" + count + "] 대");	
			}
		}
	}

	/**
	 * 장난감 정보 출력 서브 메서드
	 */
	public void printMenu() {
		System.out.println("\n===== 장난감 정보 출력 =====");
		System.out.println("1. 전체 출력");
		System.out.println("2. 자전거 정보 출력");
		System.out.println("3. 드론 정보 출력");
		System.out.println("4. 게임콘솔 정보 출력");
		System.out.println("9. 상위 메뉴");
		System.out.print("[ 선택 ] ");

	}
}
