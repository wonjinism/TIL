package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer kim = new VIPCustomer();
		kim.setCustomerID(10020);
		kim.setName("김유신");
		kim.bonusPoint = 10000;
		System.out.println(kim.showInfo());
	}
}
