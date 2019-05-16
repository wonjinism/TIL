package io.zerone.myapp0107;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.zerone.myapp0107.DAO.UserDAO;
import io.zerone.myapp0107.VO.User;

@Controller
public class UserController {

	@Autowired
	UserDAO dao;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public String insertUser(User user, String action, Model model) {
		System.out.println(action);
		int result = dao.insertUser(user);
		model.addAttribute("id", user.getId());
		return "board";
	}
}
