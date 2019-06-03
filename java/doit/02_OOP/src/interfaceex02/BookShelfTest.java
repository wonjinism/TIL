package interfaceex02;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맵 1");
		shelfQueue.enQueue("태백산맵 2");
		shelfQueue.enQueue("태백산맵 3");
	
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
