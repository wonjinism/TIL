package step07;

import step06.Bank;

public class TestAccess extends Bank {
	public void test() {
		this.publicTest(); // Bank라는 객체를 생성하지 않았기 때문에 불가능. 상속 받으면 접근 가능
		this.protectedTest();
//		this.defaultTest();
//		this.privateTest(); // 상속을 받아도 접근이 불가능함.
	}
	/*
	 * public > protected > default > private
	 * public : 해당 프로젝트 안에서 누구든지 접근이 가능하다.
	 * protected : 같은 패키지 내에서만 접근 가능하다. (단, 상속관계시에는 어디서나 접근 가능)
	 * private : 작성되어 있는 같은 클래스 안에서만 접근 가능하다.
	 * 
	 */
	public static void main(String[] args) {
		Bank b = new Bank();
		b.publicTest(); 
//		b.protectedTest(); // 메인 메소드는 static 상속 받아도 접근 불가
//		b.defaultTest(); 
//		b.privateTest();
	}
}