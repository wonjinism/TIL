package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberJoin") // action 값을 추가
//HttpServlet이 import 안되는 경우 프로젝트 build path에 apache tomcat 라이브러리를 추가해야함.
public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("계정 : " + req.getParameter("username"));
		System.out.println("비밀번호 : " + req.getParameter("password"));
		
		// 한글이 나오도록 하는 메소드와 파라미터
//		resp.setCharacterEncoding("UTF-8"); 
//		resp.setContentType("text/html; charset=UTF-8");
//		
//		String text1 = req.getParameter("username");
//		String text2 = "님 환영합니다!";
//		resp.getWriter().print("<html lang=\"ko\"><head><meta charset=\"UTF-8\"></head><body><h1>");
//		resp.getWriter().print(text1 + text2);
//		resp.getWriter().println("</h1></body></html>");
		
		// session 클라이언트와 서버를 왔다갔다 할 수 있는
		req.getSession().setAttribute("username", req.getParameter("username"));
		req.getSession().setAttribute("password", req.getParameter("password"));
		resp.sendRedirect("result.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	} 
}
