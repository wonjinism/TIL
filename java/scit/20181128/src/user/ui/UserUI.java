package user.ui;

import java.util.ArrayList;
import java.util.Scanner;

import user.dao.UserDao;
import user.vo.User;

/**
 * 회원 관리 프로그램의 사용자 화면
 */
public class UserUI {
	private UserDao dao = new UserDao();			//DB관련 처리를 하는 클래스의 객체
	private Scanner sc = new Scanner(System.in); 	//키보드로부터 입력받기 위한 클래스의 객체
	
	/**
	 * 생성자. 메뉴화면을 띄우고 사용자의 입력을 받는다.
	 * */
	public UserUI() {
		
		while(true) {
			//메인메뉴를 출력한다
			printMainMenu();
			
			//메뉴번호를 숫자로 입력받는다
			int no = 0;
			try {
				no = sc.nextInt();
			}
			catch (Exception e) {	//숫자로 입력받을 수 없는 에러가 날 경우 Exception 처리.
				sc.nextLine();		//버퍼에 남아있는 문자들 삭제
			}
			
			//입력받은 번호에 따라 처리
			switch(no){
				//회원정보 등록
				case 1:  
					insert();
					break;
				
				//전체회원 보기
				case 2: 
					list();
					break;
		
				case 3:
					delete();
					break;
				// 프로그램을 종료한다
				case 9: 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
				default:
					System.out.println("번호를 다시 선택하세요.");
			}
		}
	}
	

	
	/**
	 * 메인 메뉴를 출력한다.
	 * */
	public void printMainMenu(){
		System.out.println("[ 회원 관리 ]");
		System.out.println("1. 회원정보 등록");
		System.out.println("2. 전체 회원 목록");
		System.out.println("3. 회원 회원 삭제");
		System.out.println("9. 프로그램 종료");
		System.out.print("* 메뉴 번호를 선택하세요 > ");	
	}
	
	/**
	 * 회원정보 등록
	 */
	void insert() {
		User user;
		boolean res;
		String yn;
		
		System.out.println("[ 회원정보 등록 ]");
		sc.nextLine();			//앞서 남긴 개행문자 삭제
		
		user = new User();
		
		System.out.print("ID: ");
		user.setId(sc.nextLine());
		System.out.print("이름: ");
		user.setName(sc.nextLine());
		System.out.print("성별 (남:M 여:F 입력): ");
		user.setGender(sc.nextLine().toUpperCase());
		
		System.out.print("추가 정보를 입력하시겠습니까? (y/n) ");
		yn = sc.nextLine();
		
		if (yn.equalsIgnoreCase("y")) {
			System.out.print("전화번호: ");
			user.setPhone(sc.nextLine());
			System.out.print("주소: ");
			user.setAddress(sc.nextLine());
		}

		res = dao.insertUser(user);
		
		if (res) {
			System.out.println("저장되었습니다.");
		}
		else {
			System.out.println("저장 실패하였습니다.");
		}
	}
	
	/**
	 * 전체 회원 목록
	 */
	void list() {
		System.out.println("[ 전체 회원 목록 ]");
		ArrayList<User> list = dao.listUser();
		
		if (list == null && list.size() == 0) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}
		else {
			for (User user : list) {
				System.out.print("ID:" + user.getId() + "\t");
				System.out.print("이름:" + user.getName() + "\t");
				System.out.print("성별:" + user.getGender() + "\t");
				System.out.print("전화:" + user.getPhone() + "\t");
				System.out.println("주소:" + user.getAddress());
			}
		}
	}

	void delete() {
		System.out.println("[ 전체 회원 삭제 ]");
		sc.nextLine();
		String deleteId;
		System.out.print("삭제할 유저 ID를 입력하세요 : ");
		deleteId = sc.next();
		boolean result = dao.deleteUser(deleteId);
		if (result) System.out.println("삭제 되었습니다.");
		else System.out.println("입력한 ID의 유저가 없습니다.");
	}
}
