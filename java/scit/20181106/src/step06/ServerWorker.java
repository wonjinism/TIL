package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable {
	private Socket socket; 
	private PrintWriter pw;
	private BufferedReader br;
	
	public ServerWorker(Socket socket) {
		this.socket = socket;
	}

	public void work() throws IOException {
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream(), true);
		String str = br.readLine();
		pw.println("메시지 반사" + str);
		System.out.println(socket.getInetAddress().toString() + "님의 메시지 : " + str);
	}
	
	@Override
	public void run() { // try catch 관리와 로직이 되는 부분을 분리함.
		try {
			work();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				closeAll();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void closeAll() throws IOException {
		if (pw != null) {
			pw.close();
		}
		if (br != null) {
			br.close();
		}
		if (socket != null) {
			socket.close();
		}
	}
}