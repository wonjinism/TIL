package global.sesoc.vo;

import java.io.Serializable;

public class Toy implements Serializable {
	// Code Here
	// 필요한 필드, 생성자, setter/getter, toString() overriding
	private String serialNum;
	private String name;
	private int price;
	
	public Toy(String serialNum, String name, int price) {
		super();
		this.serialNum = serialNum;
		this.name = name;
		this.price = price;
	}
	
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[고유번호 = " + serialNum + ", 이름 = " + name + ", 가격 = " + price + "원";
	}
}
