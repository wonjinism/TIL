package step03;

public class ConsumerThread {
	public static void main(String[] args) {
		ProducerThread tw = new ProducerThread();
		tw.start();
		if(!tw.result) {
			System.out.println("ThreadWait이 완료될 때까지 대기");
			synchronized (tw){
				try {
					tw.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("완료후 총합 : " + tw.total);
		}
	}
}