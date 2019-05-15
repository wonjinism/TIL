package step00;

public class MonthlyRent extends RealEstate {
	private int monthlyRent;

	public MonthlyRent() {}
	public MonthlyRent(String houseType, int size, String location, int monthlyRent) {
		super(houseType, size, location);
		this.monthlyRent = monthlyRent; 
	}
	public int getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(int monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	@Override
	public String getInfo() {
		return super.getInfo() + ", 월세금 : " + monthlyRent;
	}
}
