package io.zerone.myapp0110;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.zerone.myapp0110.DAO.MemberDAO;
import io.zerone.myapp0110.VO.Member;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void join() {
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.setAttribute("id", null);
		return "home";
	}
	
	@RequestMapping(value = "/joinMember", method = RequestMethod.POST)
	public String insertMember(Member member, Model model) {
		int result = dao.insertMember(member);
		if(result !=0) {
			model.addAttribute("id", member.getId());
			return "login";
		}else {
			model.addAttribute("id", member.getId());
			model.addAttribute("message", "중복된 ID입니다..");
			return "join";
		}
	}
	
	@RequestMapping(value = "/loginMember", method = RequestMethod.POST)
	public String loginMemeber(Member member, HttpSession session, Model model) {
		
		System.out.println(member.getId());		
		Member loginMember = dao.loginMember(member);
		if(loginMember != null) {
			session.setAttribute("id", member.getId());
			model.addAttribute("id", member.getId());
			return "home";
		}else {
			model.addAttribute("id", member.getId());
			model.addAttribute("message", "잘못된 정보를 입력했습니다.");
			return "login";
		}
	}
	
}
