package io.zerone.simplechat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.zerone.simplechat.DAO.UserDAO;
import io.zerone.simplechat.VO.User;

@Controller
public class UserController {

	@Autowired
	UserDAO dao;

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUp(User user, Model model) {
		User checkUser = dao.selectUser(user);
		if (checkUser == null) {
			dao.insertUser(user);
			model.addAttribute("user_id", user.getUser_id());
			model.addAttribute("warning", "회원 가입이 완료됐습니다.");
			return "home";
		} else {
			model.addAttribute("user_id", user.getUser_id());
			model.addAttribute("warning", "이미 가입된 계정입니다.");
			return "join";
		}
	}

	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public String signIn(User user, Model model, HttpSession session) {
		User checkUser = dao.selectUser(user);
		if (checkUser == null) {
			model.addAttribute("warning", "가입하지 않은 ID입니다.");
			model.addAttribute("user_id", user.getUser_id());
			return "home";
		} else if (checkUser.getUser_password().equals(user.getUser_password())) {
			System.out.println("로그인 성공! " + checkUser); ////
			session.setAttribute("user_id", user.getUser_id());
			System.out.println(user.getUser_id() + " 세션 저장"); ////
			return "redirect:/list";
		} else {
			model.addAttribute("warning", "비밀 번호를 확인해 주세요.");
			model.addAttribute("user_id", user.getUser_id());
			return "home";
		}
	}
}
