package inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer lee = new Customer(10010, "Lee");
		lee.bonusPoint = 1000;
		
		VIPCustomer kim = new VIPCustomer(10020, "김유신", 12345);
		kim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(lee.getName() + " 님이 지불해야 하는 금액은 " + lee.calcPrice(price) + "원입니다.");
		System.out.println(kim.getName() + " 님이 지불해야 하는 금액은 " + kim.calcPrice(price) + "원입니다.");
	}
}
