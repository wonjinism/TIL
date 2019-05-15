package step03;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public void go() throws IOException, UnknownHostException {
		Socket socket = new Socket("203.233.199.13", 5430);
		System.out.println("socket 생성직후");
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		pw.println("난 클라이언트야.");	
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