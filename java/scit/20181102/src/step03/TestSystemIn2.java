package step03;

import java.io.IOException;

public class TestSystemIn2 {
	/*
	 * 콘솔로부터 입력받아 파일에 지속적으로 출력하는 예제
	 * 실행 예)
	 * 	점심메뉴 입력 : (키보드 입력) 짜장면
	 * 	짜장면 입력 완료!
	 * 	점심메뉴 입력 : (키보드 입력 ) 짬뽕
	 *  짬뽕 입력 완료!
	 *  점심메뉴 입력 : exit
	 *  주문완료!
	 */
	public static void main(String[] args) {
		ConsolMgr mgr = new ConsolMgr();
		try {
			mgr.menuOrder("C:\\java-io\\iotest\\step3\\filetest\\menu.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
