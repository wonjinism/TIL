package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient{
	/**
	 * 소켓 생성 
	 * ReadWorker 스레드 생성 start --> 서버에서 오는 데이터를 읽는 역할
	 * while
	 * 	 콘솔에서 입력받아 서버로 출력 
	 */
	private Socket socket;
	private BufferedReader br,serverBr;
	private PrintWriter pw;
	public void go() throws UnknownHostException, IOException{
		socket=new Socket("127.0.0.1",5432);
		//서버에서 오는 데이터를 읽는 스레드를 생성해 start 시킨다. 
		ReadWorker rw=new ReadWorker();
		rw.start();
		//콘솔에서 입력한 데이터를 서버로 전송
		br=new BufferedReader(new InputStreamReader(System.in));
		pw=new PrintWriter(socket.getOutputStream(),true);
		while(true){
			pw.println(br.readLine());
		}
	}
	public static void main(String[] args) {		
		TestClient tc=new TestClient();
		try {
			tc.go();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				tc.closeAll();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void closeAll() throws IOException{
		if(serverBr!=null)
			serverBr.close();
		if(br!=null)
			br.close();
		if(pw!=null)
			pw.close();
		if(socket!=null)
			socket.close();
	}
	public class ReadWorker extends Thread{
		/**
		 * 서버에서 오는 데이터를 입력받아 화면에 출력
		 */
		public void run(){
			try {
				serverBr=new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				while(true){
					String str=serverBr.readLine();
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}