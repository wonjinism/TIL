package kr.kfc.kiosk;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.kfc.kiosk.DAO.AdminDAO;

@RequestMapping("/admin")
@Controller
public class AdminContoller {
	
	@Autowired
	AdminDAO dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(@RequestParam(defaultValue="1") String access, String account, Model model) {
		if(access.equals("0")) {
			model.addAttribute("message", "계정명을 확인해주세요!");
			model.addAttribute("account", account);
		}else if(access.equals("2")) {
			model.addAttribute("message", "비밀번호를 확인해주세요!");
			model.addAttribute("account", account);
		}
		return "login";
	}
	
	@RequestMapping(value = "/access", method = RequestMethod.POST)
	public String access(String account, String password) {
		HashMap<String, String> login = new HashMap<String, String>();
		login.put("account", account.toLowerCase());
		login.put("password", password.toLowerCase());
		HashMap<String, String> admin = dao.getAdmin(login);
		if(admin == null) {
			return "redirect:/admin?access=0&account=" + account;
		}else if(!(admin.get("PASSWORD").equals(password))) {
			return "redirect:/admin?access=2&account=" + account;
		}else {
			return "redirect:/admin/main"; 
		}
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String admin(RedirectAttributes ra) {
		ra.addAttribute("page", "admin");
		return "redirect:/selectMenuList";
	}
}
