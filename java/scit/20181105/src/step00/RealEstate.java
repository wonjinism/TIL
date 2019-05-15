package step00;

public class RealEstate {
	private String address;
	private String houseType;
	private int size;
	
	public RealEstate() {}

	public RealEstate(String houseType, int size, String location) {
		super();
		this.houseType = houseType;
		this.size = size;
		this.address = location;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public String getInfo() {
		return "주소 : " + address + ", 주거형태 : " + houseType + ", 크기 : " + size + "(평)";
	}
}
