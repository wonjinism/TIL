package kr.kfc.kiosk.DAO;

import java.util.HashMap;

public interface OrderMapper {
	public int getCustomer_seq();
	public int insertOrderList(HashMap<String, String> order);
}
