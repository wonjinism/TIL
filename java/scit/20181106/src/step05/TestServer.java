package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	private ServerSocket serverSocket;
	private Socket socket; 
	private PrintWriter pw;
	private BufferedReader br;
	private int count = 0;
	
	public void go() throws IOException {
		serverSocket = new ServerSocket(5430);
		System.out.println("** 서버 실행 중 **");
		while(true) {
			socket = serverSocket.accept(); // 대기
			// 클라이언트에서 받는 스트림
			String ip = socket.getInetAddress().toString(); // ip 주소 기록
			br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			// 클라이언트로 보내는 스트림 
			pw = new PrintWriter(socket.getOutputStream(), true);

			// 메시지 출력 및 보내는 코드
			String serverMessage = ip + "님의  메시지 : " + br.readLine(); 
			System.out.println(serverMessage);
			
			pw.println(ip + "님의 " + ++count + "번째 메시지 반사 : " + serverMessage);
		}
	}
	public void closeAll() throws IOException {
		if (br != null) {
			br.close();
		}
		if (pw != null) {
			pw.close();
		}
		if (socket != null) {
			socket.close();
		}
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
				ts.closeAll();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("서버 메인 메서드 종료");
	}
}