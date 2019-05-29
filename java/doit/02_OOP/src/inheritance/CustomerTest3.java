package inheritance;

public class CustomerTest3 {
	public static void main(String[] args) {
		VIPCustomer hong = new VIPCustomer(10030, "홍길동", 100);
		hong.bonusPoint = 10000;
		System.out.println(hong.showInfo());
	}
}
