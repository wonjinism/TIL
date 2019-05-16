package kr.kfc.kiosk;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.kfc.kiosk.DAO.OrderDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	OrderDAO dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Welcome home! The client locale is {}." + locale);
		return "home";
	}
	

	
	@RequestMapping(value = "/startOrder", method = RequestMethod.GET)
	public String customer(HttpSession session) {
		String checkCustomer_seq = String.valueOf(session.getAttribute("customer_seq"));
		System.out.println("접속자 확인 : " + checkCustomer_seq); ////
		
		if(!(checkCustomer_seq.equals("null"))) {
			session.removeAttribute("orderList");
			session.removeAttribute("cart_count");
		}
		
		if(checkCustomer_seq.equals("null")){
			int customer_seq = dao.getCustomer_seq();
			session.setAttribute("customer_seq", customer_seq);
			System.out.println("새로운 접속 : " + customer_seq); ////
		}
		return "redirect:/selectMenuList";
	}
}
