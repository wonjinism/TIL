package polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.setCustomerID(10010);
		lee.setName("이순신");
		lee.bonusPoint = 1000;
		
		System.out.println(lee.showInfo());
		
		
		VIPCustomer kim = new VIPCustomer(10020, "김유신", 12345);
		kim.bonusPoint = 1000;

		System.out.println(kim.showInfo());
		System.out.println("========== 할인율과 보너스 포인트 계산 ===========");
		
		int price = 10000;
		int leePrice = lee.calcPrice(price);
		int kimPrice = kim.calcPrice(price);
		
		System.out.println(lee.getName() + " 님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(lee.showInfo());
		System.out.println(kim.getName() + " 님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(kim.showInfo());
	}
}
