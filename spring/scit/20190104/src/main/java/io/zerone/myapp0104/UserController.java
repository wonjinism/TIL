package io.zerone.myapp0104;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.zerone.myapp0104.DAO.userDAO;
import io.zerone.myapp0104.VO.User;

@Controller
public class UserController {
	
	@Autowired
	userDAO dao;
	
	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
	public String insertUser(User user) {

		dao.insertUser(user);
		
		return "home";
	}
}
