package step03;

import java.util.Scanner;

public class BookUI {

	Scanner sc = new Scanner(System.in);
	BookMgr mgr = new BookMgr();
	
	public BookUI() { 	// 생성자에서 모든 걸 다 돌려주면 된다.
		while(true) {
			mainMenu();
			int select = sc.nextInt();
			switch (select) {
				case 1:
					subMenu();
					int subSelect = sc.nextInt();
					if (subSelect == 1) {
						System.out.println("도서번호를 입력해 주세요.");
						String bookId = sc.next();
						System.out.println("도서제목을 입력해 주세요.");
						String name = sc.next();
						System.out.println("도서내용을 입력해 주세요.");
						String summary = sc.next();
						System.out.println("페이지 수를 입력해 주세요.");
						String pageNum = sc.next();
						Book book = new TextBook(bookId, name, summary, pageNum);
						mgr.addBook(book);	
					} else if (subSelect == 2) {
						System.out.println("도서번호를 입력해 주세요.");
						String bookId = sc.next();
						System.out.println("도서제목을 입력해 주세요.");
						String name = sc.next();
						System.out.println("도서내용을 입력해 주세요.");
						String summary = sc.next();
						System.out.println("재생시간을 입력해 주세요.");
						int playTime = sc.nextInt();
						Book book = new AudioBook(bookId, name, summary, playTime);
						mgr.addBook(book);
					}
					
					break;
				case 2:
					System.out.println("도서번호를 입력해 주세요.");
					String bookId = sc.next();
					
					Book result = mgr.searchBook(bookId); 
									
					if (result == null) {
						System.out.println("찾는 도서가 없습니다.");
					} else {
						System.out.println(result);
					}
					break;
				case 3:
					mgr.printAll();
					break;
				default:
					System.out.println("잘못 입력했습니다.");
					break;
			}
		}
	}
	public void mainMenu() {
		System.out.println("===[도서관리 프로그램]===");
		System.out.println("1) 도서 입력");
		System.out.println("2) 도서 검색");
		System.out.println("3) 전체 도서 출력");
		System.out.println("===================");		
	}
	public void subMenu() {
		System.out.println("===================");
		System.out.println("도서 타입을 선택하세요.");
		System.out.println("1) 텍스트북");
		System.out.println("2) 오디오북");
		System.out.println("===================");
	}
}
