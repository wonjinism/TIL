package io.zerone.myapp0102;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {

	}

	// VO를 만들어서 받아주는 방식
//	@RequestMapping(value = "/success", method = RequestMethod.GET)
//	public String success(User user, Model model) {
//		String result = user.getId() + " " + user.getPw();
//		System.out.println(result);
//		return "login";
//	}
	
	// Name을 파라미터로 바로 받아주는 방식
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success(String id, String pw) {
		String result = id + " " + pw;
		System.out.println(result);
		return "redirect:/login"; // login 액션으로 리다이렉트
	}
}
