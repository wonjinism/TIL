package polymorphism;

import java.util.ArrayList;

public class CustomerTest2 {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(10010, "Lee");
		Customer kim = new Customer(10020, "Kim");
		Customer hong = new GoldCustomer(10030, "Hong");
		Customer youl = new GoldCustomer(10040, "Youl");
		Customer shin = new VIPCustomer(10050, "Shin", 12345);
		
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(shin);
		
		System.out.println("===== 고객 정보 출력 =====");
		for (Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println("========== 할인율과 보너스 포인트 계산 ===========");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}
}
