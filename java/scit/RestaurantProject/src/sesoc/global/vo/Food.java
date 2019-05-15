package sesoc.global.vo;

import java.io.Serializable;

public class Food implements Serializable {
	private int foodNo;
	private String foodName;
	private int price;

	public Food() {
	}

	public Food(int foodNo, String foodName, int price) {
		super();
		this.foodNo = foodNo;
		this.foodName = foodName;
		this.price = price;
	}

	public int getFoodNo() {
		return foodNo;
	}

	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return foodNo + ". " + foodName +", " + price;
	}
}
