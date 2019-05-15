package sesoc.global.ui;

import java.util.List;
import java.util.Map;

import sesoc.global.vo.Food;
import sesoc.global.vo.Order;

public interface UI {
	public void insertOrder();
	public void deleteOrder();
	public void printMainMenu();
	public void printOrderMenu();
	public Order makeOrder(String order);
	public void printFoodList(List<Food> foodList);
	public int foodOrdered(Map<Food, Integer> map);
}