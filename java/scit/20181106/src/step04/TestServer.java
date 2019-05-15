package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	ServerSocket serverSocket; 

	public void go() throws IOException {
		serverSocket = new ServerSocket(5430);
		System.out.println("** 서버 실행 중 **");
		while(true) {
			Socket socket = serverSocket.accept(); // 대기
			String ip = socket.getInetAddress().toString(); // ip 주소 기록
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			System.out.println(ip + "님의  메시지 : " + br.readLine());
			br.close();
			socket.close();
		}
	}
	public void closeServer() throws IOException {
		if (serverSocket != null) {
			serverSocket.close();
		}
	}
	
	public static void main(String[] args) {
		TestServer ts = new TestServer();
		try {
			ts.go();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ts.closeServer();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("서버 메인 메서드 종료");
	}
}