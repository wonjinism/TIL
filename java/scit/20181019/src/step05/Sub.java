package step05;

public class Sub extends Super {
	private int money = 100;

	/**
	 * @return the money
	 */
	int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	void setMoney(int money) {
		this.money = money;
	}
	
	public void printAll() {
		// 부모의 private 멤버는 한 클래스 내에서만 접근이 가능하기 때문에 자식이라도 접근 불가능
//		System.out.println(money + " " + age);
		// 이 경우에는 set/get으로 접근 가능!
		System.out.println(money + " " + getAge());
	}	
}
