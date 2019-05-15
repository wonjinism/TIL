package step05;

public class Person {
	int money;
	public void setMoney(int money) throws MyException {
		// money 가 음수이면 MyException 강제 발생 (throw) 시킨다.
		// 호출한 곳(method)가 불려지는 곳으로 발생한 에러를 던진다. 
		if (money < 0) {
			throw new MyException("0원 이하는 할당 불가!"); 
		}
		this.money = money;

//		위와 동일한 결과가 나오는 소스
//		if (money < 0) {
//			System.out.println("0원 이하는 할당 불가!");
//		} else {
//			this.money = money;
//		}
	}
}
