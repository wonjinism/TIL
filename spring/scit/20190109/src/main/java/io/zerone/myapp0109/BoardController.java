package io.zerone.myapp0109;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.SessionScope;

import io.zerone.myapp0109.DAO.BoardDAO;
import io.zerone.myapp0109.VO.Board;

@Controller
public class BoardController {
	
	@Autowired
	BoardDAO dao;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String board(HttpSession session) {
		String id = (String) session.getAttribute("id");
		System.out.println(id); ////
		if(id == null) {
			return "login";
		}
		return "board";
	}
	
	@RequestMapping(value = "/insertBoard", method = RequestMethod.POST)
	public String insertBoard(Board board, HttpSession session, Model model) {
		if(session.getAttribute("id") == null) {
			model.addAttribute("message", "대기 상태가 오래되어 로그인이 필요합니다.");
			return "login";
		}
		board.setId((String)session.getAttribute("id"));		
		int result = dao.insertBoard(board);
		System.out.println(board.getBoardtitle()); ////
		System.out.println(board.getBoardcontent()); ////
		if(result != 0) {
			model.addAttribute("message", "게시물 등록에 성공했습니다.");
			return "board";
		}else {
			model.addAttribute("message", "게시물 등록에 실패했습니다.");
			return "board";
		}
	}
}
