package sesoc.global.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class DeliveryOrder extends Order implements Serializable{
	private String buyerPhone;		// 주문자 전화번호
	private String buyerAddress;	// 주문자 주소
	
	public DeliveryOrder() {
		// TODO Auto-generated constructor stub
	}
	public DeliveryOrder(String buyerPhone, String buyerAddress, Map<Food, Integer> orderedFoodNo) {
		super(orderedFoodNo);
		this.buyerPhone = buyerPhone;
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerPhone() {
		return buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
	public String getbuyerAddress() {
		return buyerAddress;
	}
	public void setbuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	
	@Override
	public String showOrderSituation() {
		String temp = super.showOrderSituation();
		return temp+= "주문자 전화번호 : " + buyerPhone + ", 주문자 주소 : " + buyerAddress+ "\n";
	}
}
