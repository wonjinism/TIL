package step02;

public class ThreadNoSync {
	public static void main(String[] args) {
		User user = new User();
		UserThread p1 = new UserThread(user,"A1");
		UserThread p2 = new UserThread(user,"B1");
		UserThread p3 = new UserThread(user,"C1");
		p1.start();
		p2.start();
		p3.start();
	}
}
