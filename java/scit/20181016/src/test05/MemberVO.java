package test05;

public class MemberVO {
	private String id;
	private int money;
	MemberVO(){}
	MemberVO(String id){
		this.id = id;
	}
	MemberVO(String id, int money){
		this.id = id;
		this.money = money;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
