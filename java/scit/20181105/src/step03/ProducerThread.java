package step03;

public class ProducerThread extends Thread{
	int total;
	boolean result = false;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 5; i++) {
				System.out.println(i + "를 더합니다.");
				total += i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			result = true;
			notify();
		}
	}
}