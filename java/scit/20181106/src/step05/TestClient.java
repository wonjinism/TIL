package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	private Socket socket; 
	private PrintWriter pw;
	private BufferedReader keyboardInput, serverInput;
	
	public void go() throws IOException, UnknownHostException {
		socket = new Socket("203.233.199.13", 5430);
		// 서버로 보내는 스트림 
		keyboardInput = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(socket.getOutputStream(), true);
		// 서버에서부터 받는 스트림
		serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		// 메시지 출력 및 보내는 코드
		System.out.print("서버로 보낼 메시지 : ");
		pw.println(keyboardInput.readLine()); // 콘솔에서 키보드값을 읽어서 서버로 보낸다.	
		
		System.out.println("서버에서 되돌려낸 메시지 : ");
		System.out.println(serverInput.readLine()); // 서버에서 읽은 내용을 출력한다.
	}
	
	public void closeAll() throws IOException {
		if (keyboardInput != null) {
			keyboardInput.close();
		}
		if (serverInput != null) {
			serverInput.close();
		}
		if (pw != null) {
			pw.close();
		}
		if (socket != null) {
			socket.close();
		}
	}

	public static void main(String[] args) throws IOException {
		TestClient tc = new TestClient();
		try {
			tc.go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			tc.closeAll();
		}
		System.out.println("클라이언트 메인 메서드 종료");
	}
}