package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		super();
		grade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출 ");
	}
	
	public VIPCustomer(int customerID, String name, int agentID) {
		super(customerID, name);
		grade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String) 생성자 호출 ");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showInfo() {
//		return name + " 님의 등급은 " + grade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
		return super.showInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
	}
}
