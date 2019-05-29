package inheritance;

public class OverridingTest2 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		// 선언된 클래스형인 Customer가 아니라 인스턴스의 클래스형에 재정의된 메서드가 호출됨 
	}
}
