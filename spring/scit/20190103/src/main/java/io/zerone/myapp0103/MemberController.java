package io.zerone.myapp0103;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import VO.Member;

@Controller
public class MemberController {
	static ArrayList<Member> memberList = new ArrayList<Member>();
	
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
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String success(Member member, HttpSession session, Model model) {
		System.out.println(member.toString());
		for (Member member2 : memberList) {
			if(member2.getId().equals(member.getId())) {
				model.addAttribute("warning", "이미 등록된 아이디입니다.");
				return "login";
			}
		}
		session.setAttribute("id", member.getId()); // 세션은 3시간 정도 저장
		memberList.add(member);
		model.addAttribute("messageList", new ChattingController().messageList);
		return "chatting";
	}
}
