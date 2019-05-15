package step06;

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
	private int count = 0;
	
	public void go() throws IOException {
		serverSocket = new ServerSocket(5430);
		System.out.println("** 서버 실행 중 **");
		while(true) {
			socket = serverSocket.accept(); // 대기
			System.out.println(++count + "번째 클라이언트 " + socket.getInetAddress() + "님이 입장하셨습니다.");
			ServerWorker sw = new ServerWorker(socket);

//			new Thread(sw).start();
			Thread t = new Thread(sw);
			t.start();
		}
	}
	public void closeAll() throws IOException {
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