package step00;

public class BuyingAndSelling extends RealEstate {
	private int price;
	
	public BuyingAndSelling() {}
	
	public BuyingAndSelling(String houseType, int size, String location, int price) {
		super(houseType, size, location);
		this.price = price; 
	}

	public BuyingAndSelling(int price) {
		super();
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String getInfo() {
		return super.getInfo() + ", 매매가격 : " + price;
	}
	
	
}
