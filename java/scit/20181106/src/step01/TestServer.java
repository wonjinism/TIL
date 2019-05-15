package step01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5430);
			System.out.println("serverSocket.accept() Before");
			Socket socket = serverSocket.accept(); // 대기
			System.out.println("serverSocket.accept() After");
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			pw.println("넌 지금 서버의 메시지를 받았다!");
			pw.close();
			os.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 메서드 종료");
	}
}
