package step03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsolMgr {

	public void menuOrder(String path) throws IOException {
		// 키보드로부터 입력 관련
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		// 파일 관련
		File f = new File(path);
		f.getParentFile().mkdirs(); // 디렉토리까지 생성. 있으면 그대로 진행
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);

		while (true) {
			System.out.println("점심메뉴 입력 : ");
			String data = br.readLine();
			if (data.equals("exit")) {
				System.out.println("주문완료!!");
				break;
			}
			pw.println(data);
			System.out.println(data + "입력완료");
		}
		br.close();
		isr.close();
		is.close();

		pw.close();
		fw.close();
	}
}
