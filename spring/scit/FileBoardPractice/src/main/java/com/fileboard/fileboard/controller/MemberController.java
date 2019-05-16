package com.fileboard.fileboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fileboard.fileboard.dao.MemberDAO;
import com.fileboard.fileboard.vo.Member;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao;

	@RequestMapping(value = "/login", method = { RequestMethod.POST, RequestMethod.GET })
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/signup", method = { RequestMethod.POST, RequestMethod.GET })
	public String signup() {
		return "signup";
	}

	@RequestMapping(value = "/logout", method = { RequestMethod.POST, RequestMethod.GET })
	public String logout(HttpSession session) {

		session.invalidate();

		return "redirect:/";
	}

	@RequestMapping(value = "/insertMember", method = RequestMethod.POST)
	public String insertMember(Member member, Model model) {
		int result = dao.insertMember(member);

		if (result == 0) {
			model.addAttribute("message", "ID중복으로 가입실패");
			model.addAttribute("member", member);
			return "signup";
		}

		return "redirect:/";
	}

	@RequestMapping(value = "/selectMember", method = RequestMethod.POST)
	public String selectMember(Member member, HttpSession session, Model model) {

		Member result = dao.selectMember(member);

		if (result == null) {
			model.addAttribute("message", "id와 pw를 확인해주세요.");
			model.addAttribute("member", member);
			return "login";
		}

		session.setAttribute("loginId", result.getId());

		return "redirect:/";
	}

}
