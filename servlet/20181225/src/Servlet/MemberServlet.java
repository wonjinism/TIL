package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;
import VO.Member;

@WebServlet("/memberJoin")
public class MemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	@Override
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
				resp.getWriter().println("<html><head><script>alert(\"이미 존재하는 아이디입니다.\");history.back();</script></head></html>");
//				resp.sendRedirect("index.jsp");
			}else {
				req.getSession().setAttribute("username", username);
				resp.getWriter().println("<html><head><script>alert(\"회원 가입에 성공했습니다. 로그인 페이지로 이동합니다.\");window.location.href='login.jsp';</script></head></html>");
//				resp.sendRedirect("login.jsp");
			}
		}else if(action.equals("loginMember")) {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			MemberDAO dao = new MemberDAO();
			Member member = dao.loginMember(new Member(username, password));
			if(member != null) {
				resp.getWriter().println("<html><head><script>alert(\"로그인에 성공했습니다.\");history.back();</script></head></html>");
			}else {
				resp.getWriter().println("<html><head><script>alert(\"아이디 또는 패스워드가 잘못 되었습니다.\");history.back();</script></head></html>");
			}
		}
		
	}
}
