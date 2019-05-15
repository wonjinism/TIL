package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 클라이언트와 실제 통신하는 클래스 
 * 이 클래스의 객체는 스레드 생성시 인자값으로 setting  
 * @author inst
 *
 */

public class ServerWorker extends Thread {
	ArrayList<ServerWorker> list;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	public ServerWorker(Socket socket, ArrayList<ServerWorker> list) throws IOException {
		this.socket = socket;
		this.list = list;
		br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw=new PrintWriter(socket.getOutputStream(),true);
		String message = socket.getInetAddress()+"님 입장...";
		System.out.println(message);
		
		synchronized (list) {
			list.add(this);
		}
	}
	public void work() throws IOException{
		while(true){
			String str=br.readLine();
			broadcasting(socket.getInetAddress()+"님  : "+str);
			System.out.println("서버스레드 run() "+socket.getInetAddress()+" "+str);
		}
	}
	// 퇴장시 removeWork(this) ...
	@Override
	public void run() {
		try {
			work();
		} catch (IOException e) {
			System.out.println(socket.getInetAddress()+"님이 퇴장..");
			//e.printStackTrace();
		}finally{
			try {
				removeWorker(this);
				closeAll();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	public void closeAll() throws IOException{
		if(pw!=null)
			pw.close();
		if(br!=null)
			br.close();
		if(socket!=null)
			socket.close();
	}
	public void sendMessage(String message) {
		pw.println(message);
	}

	/**
	 * ServerWorker 가 호출하는 메서드 리스트의 전체 스레드(ServerWorker)로 모든 클라이언트에게 메세지를
	 * 전송한다....hint sendMessage() call
	 * 
	 * @param message
	 */
	public void broadcasting(String message) {
		for (ServerWorker serverWorker : list) {
			serverWorker.sendMessage(message);
		}
	}

	/**
	 * ServerWorker 에서 호출 IOException -> 퇴장 -> 리스트에서 해당 스레드를 삭제 list.remove(Object)
	 * 
	 * @param worker
	 */
	public void removeWorker(ServerWorker worker) {
		list.remove(worker);
		broadcasting(socket.getInetAddress()+"님이 떠났습니다.");
	}
}













