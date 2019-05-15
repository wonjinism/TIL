package step04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBasicIO2 {
	public static void main(String[] args) {
		// 파일을 읽는 노드스트림
		try {
			FileReader fr = new FileReader("E:\\trunk\\files\\outer.txt");
			BufferedReader br = new BufferedReader(fr);
			String str1 = br.readLine();
			String str2 = br.readLine();
			System.out.println(str1);
			System.out.println(str2);
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("읽기 실패");
//			e.printStackTrace();
		}
	}
}
