package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public void go() throws IOException, UnknownHostException {
		Socket socket = new Socket("203.233.199.13", 5430);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		System.out.print("서버로 보낼 메시지 : ");
		pw.println(br.readLine());	
		pw.close();
		socket.close();
	}
	public static void main(String[] args) {
		TestClient tc = new TestClient();
		try {
			tc.go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 메인 메서드 종료");
	}
	
}