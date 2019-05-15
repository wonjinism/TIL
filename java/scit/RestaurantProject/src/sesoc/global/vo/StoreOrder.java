package sesoc.global.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class StoreOrder extends Order implements Serializable{
	private int tableNo;
	public StoreOrder() {
	}
	public StoreOrder(int tableNo, Map<Food, Integer> orderedFoodNo) {
		super(orderedFoodNo);
		this.tableNo = tableNo;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	@Override
	public String showOrderSituation() {
		String temp = super.showOrderSituation();
		return temp += "테이블 번호 : " + tableNo + "\n";
	}
}
