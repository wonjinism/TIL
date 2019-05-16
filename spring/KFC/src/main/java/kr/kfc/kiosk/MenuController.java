package kr.kfc.kiosk;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.kfc.kiosk.DAO.MenuDAO;
import kr.kfc.kiosk.VO.Menu;
import kr.kfc.kiosk.util.PageNavigator;

@Controller
public class MenuController {

	@Autowired
	MenuDAO dao;
	
	private final int pagePerGroup = 3;
	private final int postPerPage = 3;
	
	@RequestMapping(value = "/selectMenuList", method = RequestMethod.GET)
	public String selectMenuList(
			@RequestParam(defaultValue="") String search,
			@RequestParam(defaultValue="1") int currentPage,
			@RequestParam(defaultValue="customer") String page, 
			@RequestParam(defaultValue="") String message, 
			@RequestParam(defaultValue="") String cart_count,
			Model model) {
		
		int totalPage = dao.totalCount(currentPage); //// 
		PageNavigator pn = new PageNavigator(postPerPage, currentPage, currentPage, totalPage)
		
		ArrayList<Menu> menuList = dao.selectMenuList();
		model.addAttribute("menuList", menuList);
		System.out.println(message); ////
		
		if(!(message.equals(""))) {
			model.addAttribute("message", message);
		}
		if(!(message.equals(""))) {
			model.addAttribute("cart_count", cart_count);
		}
		return page;
	}
	
	@RequestMapping(value = "/addMenu", method = RequestMethod.GET)
	public String addMenu(Menu menu, RedirectAttributes ra) {
		ra.addAttribute("page", "admin_editor");
		return "redirect:/selectMenuList";
	}
	
	@RequestMapping(value = "/editMenu", method = RequestMethod.GET)
	public String editMenu(int menu_seq, Model model) {
		Menu menu = dao.selectMenu(menu_seq);
		model.addAttribute("menu", menu);
		model.addAttribute("status", "edit");
		return "admin_editor";
	}
	
	@RequestMapping(value = "/updateMenu", method = RequestMethod.GET)
	public String updateMenu(Menu menu, RedirectAttributes ra) {
		dao.updateMenu(menu);
		ra.addAttribute("page", "admin");
		return "redirect:/selectMenuList";
	}
	
	@RequestMapping(value = "/deleteMenu", method = RequestMethod.GET)
	public String updateMenu(int menu_seq, RedirectAttributes ra) {
		dao.deleteMenu(menu_seq);
		ra.addAttribute("page", "admin");
		return "redirect:/selectMenuList";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(int menu_seq) {
//		Menu menu = dao.selectMenu(menu_seq);
		
//		return "detail";
		return "redirect:/selectMenuList";
	}		

	
//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	public String search(String search, String page) {
//		
//		return page;
//	}

	//	페이징 기능 있음 (우선순위 낮음)
//	searchMenuList(String search, String page)
}
