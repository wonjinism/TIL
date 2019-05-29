package inheritance;

public class CustomerTest {
	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.setCustomerID(10010);
		lee.setName("이순신");
		lee.bonusPoint = 1000;
		System.out.println(lee.showInfo());
		
		VIPCustomer kim = new VIPCustomer();
		kim.setCustomerID(10020);
		kim.setName("김유신");
		kim.bonusPoint = 10000;
		System.out.println(kim.showInfo());
	}
}
