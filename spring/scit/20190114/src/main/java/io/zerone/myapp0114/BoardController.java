package io.zerone.myapp0114;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.zerone.myapp0114.DAO.BoardDAO;
import io.zerone.myapp0114.VO.Board;
import io.zerone.myapp0114.VO.Comment;

@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;

	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String board(HttpSession session, Model model) {
		String id = (String) session.getAttribute("id");
		if (id == null) {
			model.addAttribute("message", "로그인이 필요합니다.");
			return "login";
		}
		return "redirect:/selectBoardList";
	}

	@RequestMapping(value = "/insertBoard", method = RequestMethod.POST)
	public String insertBoard(Board board, HttpSession session, Model model) {
		if (session.getAttribute("id") == null) {
			model.addAttribute("message", "대기 상태가 오래되어 로그인이 필요합니다.");
			return "login";
		}
		board.setId((String) session.getAttribute("id"));
		int result = dao.insertBoard(board);
		System.out.println(board.getBoardtitle()); ////
		System.out.println(board.getBoardcontent()); ////
		if (result != 0) {
			model.addAttribute("message", "게시물 등록에 성공했습니다.");
			return "boardEditor";
		} else {
			model.addAttribute("message", "게시물 등록에 실패했습니다.");
			return "boardEditor";
		}
	}

	@RequestMapping(value = "/selectBoardList", method = RequestMethod.GET)
	public String selectBoardList(Model model, HttpSession session) {
		if(session.getAttribute("id") == null) {
			model.addAttribute("message", "로그인이 필요합니다.");
			return "login";
		}
		ArrayList<Board> boardList = dao.selectBoardList();
		model.addAttribute("boardList", boardList);
		return "board";
	}

	@RequestMapping(value = "/boardDetail", method = RequestMethod.GET)
	public String boardDetail(Model model, String boardseq) {
		try {
			Integer.parseInt(boardseq);
		} catch (Exception e) { // 파싱 에러
			e.printStackTrace();
			System.out.println("boardseq 파싱 에러"); ////
			return "redirect:/selectBoardList";
		}

		try {
			int result = dao.increaseHitcount(boardseq);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("hitcount 오류"); ////
			return "redirect:/selectBoardList";
		}
		
		Board board = dao.selectBoard(boardseq);
		if (board == null) {
			model.addAttribute("message", "존재하지 않는 게시물입니다!");
			return "redirect:/selectBoardList";
		}
		model.addAttribute("board", board);
		selectComments(board.getBoardseq()+"", model);
		return "boardDetail";
	}
	
	@RequestMapping(value = "/editBoard", method = RequestMethod.GET)
	public String editBoard(Board board, Model model, HttpSession session) {
		System.out.println(board); ////
		if(!(board.getId().equals(session.getAttribute("id")))) {
			model.addAttribute("message", "비정상적인 접근입니다. (수정권한 없음)");
			return "login";
		}else {
			Board selectBoard = dao.selectBoard(String.valueOf(board.getBoardseq()));
			if(selectBoard == null) {
				System.out.println("없는 게시물 또는 데이터베이스 오류"); ////
			}
			model.addAttribute("board", selectBoard);
			model.addAttribute("status", "editBoard");
		}
		return "boardEditor";
	}
	
	@RequestMapping(value = "/updateBoard", method = RequestMethod.POST)
	public String updateBarod(Board board, HttpSession session, Model model) {
		System.out.println(board);
		if(!(board.getId().equals(session.getAttribute("id")))) {
			model.addAttribute("message", "비정상적인 접근입니다. (수정권한 없음)");
		}else {
			int result = dao.updateBoard(board);
			if(result == 0) {
				model.addAttribute("message", "게시물 수정에 실패했습니다. (DB 오류)");
			}else {
				model.addAttribute("message", "게시물이 수정되었습니다.");
				board = dao.selectBoard(String.valueOf(board.getBoardseq())); 
			}
		}
		model.addAttribute("board", board);
		return "boardDetail";
	}
	
	@RequestMapping(value = "/deleteBoard", method = RequestMethod.GET)
	public String deleteBoard(Board board, HttpSession session, Model model) {
		if(!(board.getId().equals(session.getAttribute("id")))) {
			model.addAttribute("message", "비정상적인 접근입니다. (삭제권한 없음)");
		}else {
			String boardseq = String.valueOf(board.getBoardseq());
			int result = dao.deleteBoard(boardseq);
			if(result == 0) {
				model.addAttribute("message", "게시물 삭제에 실패했습니다. (DB 오류)");
				return "redirect:/boardDetail"; 
			}else {
				model.addAttribute("message", "게시물이 삭제되었습니다.");
			}
		}
		return "redirect:/selectBoardList";
	}
	
	@RequestMapping(value = "/insertComment", method = RequestMethod.POST)
	public String insertComment(Comment comment, HttpSession session, Model model) {
		if(!(comment.getId().equals(session.getAttribute("id")))) {
			model.addAttribute("message", "비정상적인 접근입니다. (삭제권한 없음)");
		}else {
			int result = dao.insertComment(comment);
			if(result == 0) {
				model.addAttribute("message", "댓글 추가에 실패했습니다.. (DB 오류)");
				return "redirect:/boardDetail"; 
			}else {
				model.addAttribute("message", "댓글이 추가 되었습니다.");
			}
		}
		Board board = dao.selectBoard(comment.getBoardseq()+"");
		model.addAttribute("board", board);
		selectComments(board.getBoardseq()+"", model);
		return "boardDetail";
	}
	
	
	@RequestMapping(value = "/deleteComment", method = RequestMethod.GET)
	public String deleteComment(String commentseq, String boardseq, Model model) {
		int result = 0;
		try {
			result = dao.deleteComment(commentseq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Board board = dao.selectBoard(boardseq);
		model.addAttribute("board", board);
		selectComments(board.getBoardseq()+"", model);
		return "boardDetail";
	}
	
	
	public void selectComments(String boardseq, Model model) {
		ArrayList<Comment> cList = dao.selectComments(boardseq);
		model.addAttribute("cList", cList);
//		return model;
	}
}
