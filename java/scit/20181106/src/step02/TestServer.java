package step02;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5430);
		System.out.println("** 서버 실행 중 **");
		while(true) {
			Socket socket = serverSocket.accept(); // 대기
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			pw.println("넌 지금 서버의 메시지를 받았다!");	
//			pw.close();
//			os.close();
//			socket.close();
//			serverSocket.close();
		}
	}
	public static void main(String[] args) {
		TestServer ts = new TestServer();
		try {
			ts.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 메인 메서드 종료");
	}
}
