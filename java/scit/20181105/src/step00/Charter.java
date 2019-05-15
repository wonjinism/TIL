package step00;

public class Charter extends RealEstate {
	private int depositMoney;

	public Charter() {
	}

	public Charter(String houseType, int size, String location, int depositMoney) {
		super(houseType, size, location);
		this.depositMoney = depositMoney; 
	}
	
	public Charter(int depositMoney) {
		super();
		this.depositMoney = depositMoney;
	}

	public int getDepositMoney() {
		return depositMoney;
	}

	public void setDepositMoney(int depositMoney) {
		this.depositMoney = depositMoney;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + ", 전세보증금 : " + depositMoney;
	}

}
