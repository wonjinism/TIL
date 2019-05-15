package step02;

public class User {
	private int userNo = 0;

	//	public synchronized void add(String name) {
//		System.out.println(name + " : " + userNo++ + "번째 사용");
//	}
	public void add(String name) {
		synchronized (this) {
		System.out.println(name + " : " + userNo++ + "번째 사용");
		}
	}
}
