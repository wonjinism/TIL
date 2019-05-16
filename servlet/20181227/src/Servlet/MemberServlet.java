package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.MemberDAO;
import VO.Board;
import VO.Member;

@WebServlet("/memberJoin")
public class MemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String action = req.getParameter("action");
		if(action.equals("insertBoard")) {
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			
			HttpSession session = req.getSession();
			String username = (String)session.getAttribute("username");
			if(username == null) {
				req.setAttribute("message", "게시물 작성을 위해 로그인이 필요합니다.");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}else {
				String message = req.getParameter("message");
				System.out.println(message);////
				MemberDAO dao = new MemberDAO();
				Board board = new Board(username, message);
				dao.insertBoard(board);
				
				ArrayList<Board> boardList = dao.selectBoard();
				req.setAttribute("boardList", boardList);
				RequestDispatcher rd = req.getRequestDispatcher("board.jsp");
				rd.forward(req, resp);
			}
		}
	}

	@Override
	// servlet 컨테이너가 servlet에게 준 req와 resp 객체
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String action = req.getParameter("action");
		
		if(action.equals("insertMember")) {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			MemberDAO dao = new MemberDAO();
			int result = dao.insertMember(new Member(username, password));
			
			if(result == 0) {			
				// 리퀘스트 디스패쳐 객체를 사용해서 보내는 jsp에 req를 위임
				req.setAttribute("message", "아이디 중복으로 가입에 실패");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);				
				
//				resp.sendRedirect("index.jsp"); // 보내는 시점에 현재의 req와 resp 객체를 죽인다. 서버에서 파라미터를 보낼 수 없는 타입. 세션과 쿠키를 사용하는 것이 유일한 방법 
			}else {
				req.getSession().setAttribute("username", username);
				resp.sendRedirect("login.jsp");
			}
		}else if(action.equals("loginMember")) {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			MemberDAO dao = new MemberDAO();
			Member member = dao.loginMember(new Member(username, password));
			if(member != null) {
				ArrayList<Board> boardList = dao.selectBoard();
				req.setAttribute("boardList", boardList);
				RequestDispatcher rd = req.getRequestDispatcher("board.jsp");
				rd.forward(req, resp);
//				resp.getWriter().println("<html><head><script>alert(\"로그인에 성공했습니다.\");history.back();</script></head></html>");
			}else {
				req.setAttribute("message", "아이디 또는 패스워드가 잘못 되었습니다.");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
//				resp.getWriter().println("<html><head><script>alert(\"아이디 또는 패스워드가 잘못 되었습니다.\");history.back();</script></head></html>");
			}
		}else if(action.equals("insertBoard")) {
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			
			HttpSession session = req.getSession();
			String username = (String)session.getAttribute("username");
			if(username == null) {
				req.setAttribute("message", "게시물 작성을 위해 로그인이 필요합니다.");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}else {
				String message = req.getParameter("message");
				System.out.println(message);////
				MemberDAO dao = new MemberDAO();
				Board board = new Board(username, message);
				dao.insertBoard(board);
				
				ArrayList<Board> boardList = dao.selectBoard();
				req.setAttribute("boardList", boardList);
				RequestDispatcher rd = req.getRequestDispatcher("board.jsp");
				rd.forward(req, resp);
			}
		}
	}
}
