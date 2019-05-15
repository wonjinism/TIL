package step05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\trunk\\files\\outer.txt");
			BufferedReader br = new BufferedReader(fr);
			
//			while (br.readLine() != null) {
//				System.out.println(br.readLine());
//			}
			// readLine() 메소드 부를 때 마다 한 줄씩 읽어오기 때문에 위와 같은 방법으로는 안됨.
			
			String str = br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}
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