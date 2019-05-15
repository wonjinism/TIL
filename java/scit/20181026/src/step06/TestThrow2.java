package step06;

import java.io.FileNotFoundException;

public class TestThrow2 {
	public static void main(String[] args) {
		Editor e = new Editor();
		// 존재하지 않는 파일명을 입력할 경우 : 3 4 5
		// 존재하는 파일명을 입력할 경우 : 1 2 4 5 
		try {
			e.read("c://RHDSetup.log");
			System.out.println(2);
		} catch (FileNotFoundException e1) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
