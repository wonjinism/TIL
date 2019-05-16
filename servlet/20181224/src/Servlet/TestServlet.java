package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.User;

@WebServlet("/login")
public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone"); 
		String email = req.getParameter("email");
		
		User newUser = new User();
		newUser.setId(id);
		newUser.setPw(pw);
		newUser.setName(name);
		newUser.setAddress(address);
		newUser.setPhone(phone);
		newUser.setEmail(email);
		
		System.out.println(newUser.toString());
		
		HttpSession hs = req.getSession();
		hs.setAttribute("id", id);
		
		resp.sendRedirect("result.jsp");
	}
}
