package step07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class TestServer {
	/**
	 * 클라이언트 접속-> accept() -> 소켓 -> ServerWorker-> list추가(ServerWorker) ->start() 전체
	 * 스레드가 메세지를 공유하기 위해 리스트를 생성
	 */
	private ServerSocket serverSocket;
	private ArrayList<ServerWorker> list;

	public void go() throws IOException {
		serverSocket=new ServerSocket(5432);
		System.out.println("**서버실행**");
		list = new ArrayList<>();
		while(true){
			//클라이언트가 접속하면 accept() 수행하여 일반 소켓리턴 
			Socket socket=serverSocket.accept();
			if (socket != null) {
				ServerWorker worker=new ServerWorker(socket, list);
				Thread t=new Thread(worker);
				t.start();
			}
		}
	}

	public void closeAll() throws IOException {
		if (serverSocket != null)
			serverSocket.close();
	}

	public static void main(String[] args) {
		TestServer ts=new TestServer();
		try {
			ts.go();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				ts.closeAll();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
