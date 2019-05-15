package step02;

public class UserThread extends Thread {

	User user;

	public UserThread(User user, String name) {
		super(name);
		this.user = user;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				user.add(getName());
				sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
