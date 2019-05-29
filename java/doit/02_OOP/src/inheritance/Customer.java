package inheritance;

public class Customer {
	protected int customerID;
	protected String name;
	protected String grade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
		grade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출 ");
	}

	public Customer(int customerID, String name) {
		this.customerID = customerID;
		this.name = name;
		grade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showInfo() {
		return name + " 님의 등급은 " + grade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

}
