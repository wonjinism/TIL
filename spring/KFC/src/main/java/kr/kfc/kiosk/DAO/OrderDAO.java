package kr.kfc.kiosk.DAO;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {
	
	@Autowired
	SqlSession session;
	
	/**
	 * customer_seq의 다음 값을 생성해서 리턴 
	 */
	public int getCustomer_seq() {
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		int customer_seq = 0;
		try {
			customer_seq = mapper.getCustomer_seq();
		} catch (Exception e) {
			e.printStackTrace();
			return customer_seq;
		}
		return customer_seq;
	}
	
	public int makeOrder(ArrayList<HashMap<String, String>> orderList) {
		OrderMapper mapper = session.getMapper(OrderMapper.class);
		int result = 0;
		try {
			for (HashMap<String, String> order : orderList) {
				mapper.insertOrderList(order);
			}
			// 이거.. 주문 타입이랑 customer_seq를 받아서 order_info에 주문 정보를 완료!
//			mapper.makeOrder();
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
}
