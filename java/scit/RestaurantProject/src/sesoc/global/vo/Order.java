package sesoc.global.vo;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Order implements Serializable {
	public static int ORDER_NO;			// 주문이 일어날 때마다 번호를 자동증가, 유일한 값이어야 한다.
	private int orderNo;			  	// 주문번호(pk)
	private Map<Food, Integer> orderedFoods; // 주문한 음식과 갯수를 저장
	
	public Order() {
	}

	public Order(Map<Food, Integer> orderedFoods) {
		ORDER_NO++;
		this.orderNo = ORDER_NO;
		this.orderedFoods = orderedFoods;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public Map<Food, Integer> getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoodNo(Map<Food, Integer> orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public String showOrderSituation() {
		String foods = "";
		
		for(Map.Entry<Food, Integer> s : orderedFoods.entrySet() ) {
			Food food = s.getKey();
			int count = s.getValue();
			foods += food.getFoodName() + " " + food.getPrice() +"원  " + count+ "개 / ";
		}
		return "주문 번호(" + orderNo + "번) " + foods ;
	}
}
