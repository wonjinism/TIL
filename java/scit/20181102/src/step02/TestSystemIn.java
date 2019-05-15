package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TestSystemIn {
	/*
	 * 콘솔로부터 데이터를 입력받는 예제
	 * System.in 을 통해 InputStream 객체를 만들고 InputStreamReader 객체로
	 * BufferedReader에 연결 노드스트림 8비트를 16비트로 스트림 변경 readLine()
	 */
	public static void main(String[] args) {
		// 콘솔에 연결되는 입력 스트림 (노드 스트림)
		InputStream is = System.in;
		// 8 -> 16bit 스트림으로 변경하는 프로세스 스트림
		InputStreamReader isr = new InputStreamReader(is);
		// readLine() 과 같은 편리한 기능을 가진 프로세스 스트림
		BufferedReader br = new BufferedReader(isr);
		try {
			while (true) {
				System.out.println("이상형을 입력하세요 : ");
				String data;
				data = br.readLine();
				if (data.equals("exit")) {
					break;
				}
				System.out.println("당신의 이상형은 " + data);
			}
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}