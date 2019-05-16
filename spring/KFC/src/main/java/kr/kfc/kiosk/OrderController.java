package kr.kfc.kiosk;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.kfc.kiosk.DAO.OrderDAO;

@Controller
public class OrderController {

	@Autowired
	OrderDAO dao;
	
	private static ArrayList<HashMap<String, String>> orderList = new ArrayList<HashMap<String, String>>();
		
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String customer(HttpSession session) {
		return "redirect:/selectMenuList";
	}

	@RequestMapping(value = "/addCart", method = RequestMethod.GET)
	public String addCart(HttpSession session, String menu_seq, String quantity, String menu_name, String image, RedirectAttributes ra) {
		HashMap<String, String> order = new HashMap<String, String>();
		String customer_seq = String.valueOf(session.getAttribute("customer_seq"));
		
		// 기존 orderList에 동일한 menu_seq가 있는지 확인해서 quantity 업데이트하기
		boolean existCheck = false;
		for (HashMap<String, String> oldOrder : orderList) {
			if(oldOrder.get("menu_seq").equals(menu_seq)) {
				System.out.println("이미 장바구니에 있다!!!!");
				int currentQuantity = Integer.parseInt(oldOrder.get("quantity"));
				oldOrder.put("quantity", String.valueOf(currentQuantity + 1));
				existCheck = true;
				System.out.println("주문 내역 : " + oldOrder.toString()); ////
				break;
			}
		}
		if(existCheck == false) {
			order.put("customer_seq", customer_seq);
			order.put("menu_name", menu_name);
			order.put("menu_seq", menu_seq);
			order.put("quantity", quantity);
			order.put("image", image);
			orderList.add(order);
			System.out.println("주문 내역 : " + order.toString()); ////
		}
		System.out.println("장바구니 담긴 주문 : " + orderList.size() + "개"); ////
		System.out.println(orderList.toString()); ////
		
		session.setAttribute("orderList", orderList);
		// 장바구니에 담겼다는 메시지를 보여줘야함
		String message = menu_name + "상품이 장바구니에 추가되었습니다.";
		ra.addAttribute("message", message);
		session.setAttribute("cart_count", orderList.size());
		return "redirect:/selectMenuList";
	}
	
//	@RequestMapping(value = "/updateCart", method = RequestMethod.GET)
//	public String updateCart(HttpSession session, String menu_seq, String quantity, String menu_name, RedirectAttributes ra) {
//		HashMap<String, String> order = new HashMap<String, String>();
//		String customer_seq = String.valueOf(session.getAttribute("customer_seq"));
//		order.put("customer_seq", customer_seq);
//		order.put("menu_name", menu_name);
//		order.put("menu_seq", menu_seq);
//		order.put("quantity", quantity);
//		orderList.add(order);
//		System.out.println("주문 내역 : " + order.toString()); ////
//		System.out.println("장바구니 담긴 주문 : " + orderList.size() + "개"); ////
//		System.out.println(orderList.toString()); ////
//		
//		session.setAttribute("orderList", orderList);
//		// 장바구니에 담겼다는 메시지를 보여줘야함
//		String message = menu_name + "상품이 장바구니에 추가되었습니다.";
//		ra.addAttribute("message", message);
//		session.setAttribute("cart_count", orderList.size());
//		return "redirect:/selectMenuList";
//	}
//	
//	@RequestMapping(value = "/removeCart", method = RequestMethod.GET)
//	public String removeCart(HttpSession session, String menu_seq, String quantity, String menu_name, RedirectAttributes ra) {
//		HashMap<String, String> order = new HashMap<String, String>();
//		String customer_seq = String.valueOf(session.getAttribute("customer_seq"));
//		order.put("customer_seq", customer_seq);
//		order.put("menu_name", menu_name);
//		order.put("menu_seq", menu_seq);
//		order.put("quantity", quantity);
//		orderList.add(order);
//		System.out.println("주문 내역 : " + order.toString()); ////
//		System.out.println("장바구니 담긴 주문 : " + orderList.size() + "개"); ////
//		System.out.println(orderList.toString()); ////
//		
//		session.setAttribute("orderList", orderList);
//		// 장바구니에 담겼다는 메시지를 보여줘야함
//		String message = menu_name + "상품이 장바구니에 추가되었습니다.";
//		ra.addAttribute("message", message);
//		session.setAttribute("cart_count", orderList.size());
//		return "redirect:/selectMenuList";
//	}
	
	@RequestMapping(value = "/directOrder", method = RequestMethod.GET)
	public String directOrder(Model model, HttpSession session, String menu_seq, String quantity, String menu_name, String image) {
		ArrayList<HashMap<String, String>> directOrderList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> order = new HashMap<String, String>();
		String customer_seq = String.valueOf(session.getAttribute("customer_seq"));
		order.put("customer_seq", customer_seq);
		order.put("menu_name", menu_name);
		order.put("menu_seq", menu_seq);
		order.put("quantity", quantity);
		order.put("image", image);
		directOrderList.add(order);
		System.out.println("주문 내역 : " + order.toString()); ////
		
		model.addAttribute("orderMap", order); ////
		model.addAttribute("directOrderList", directOrderList);
		return "orderConfirm";
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order() {
		return "order";
	}
	
	@RequestMapping(value = "/orderConfirm", method = RequestMethod.GET)
	public String orderConfirm(HttpSession session) {
		int result = 0;
		result = dao.makeOrder(orderList);
		if(result == 1) {
			session.removeAttribute("customer_seq");
			session.removeAttribute("orderList");
		}
		return "home";
	}
}
