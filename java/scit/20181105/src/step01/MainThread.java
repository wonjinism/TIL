package step01;

public class MainThread {
	public static void main(String[] args) {
		int count = 0;
		SubThread st = new SubThread();
		st.start();
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(count + " ");
			count++;
		}
	}
}

class SubThread extends Thread {

	@Override
	public void run() {
		char ch = 65;
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(ch + " ");
			ch++;
			if(ch > 128) {
				ch = 65;
				continue;
			}
		}
	}
}