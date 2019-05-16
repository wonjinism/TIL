package Servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public LoginServlet() {
		super();
		map.put("javaking", "abcd"); // key : id , value: password
		map.put("starjava", "aaaa");
		map.put("jsp", "bbbb");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		resp.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/html; charset=UTF-8");
		if(map.containsKey(id)) {
			if(map.get(id).equals(pw)) {
				req.getSession().setAttribute("id", id);
				resp.sendRedirect("result.jsp");
			}else {
				resp.getWriter().print("<html><head></head><script>alert(\"패스워드가 일치하지 않음!\");history.back();</script><body></body></html>");
			}
		}else{
			resp.getWriter().print("<html><head></head><script>alert(\"아이디가 일치하지 않음!\");history.back();</script><body></body></html>");
		}
	}

}
