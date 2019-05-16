package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/select")
public class SelectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String star = req.getParameter("star");
		switch (star) {
		case "iu":
			resp.getWriter().println("<html><head></head><body><img src=\"http://file2.nocutnews.co.kr/newsroom/image/2018/07/18/20180718120948825781_0_420_600.jpg\"></body></html>");
			break;
		case "ha":
			resp.getWriter().println("<html><head></head><body><img src=\"https://img.huffingtonpost.com/asset/5bc5345d1f00000403259609.jpeg?ops=scalefit_630_noupscale\"></body></html>");
			break;
		case "kth":
			resp.getWriter().println("<html><head></head><body><img src=\"http://img.etoday.co.kr/pto_db/2018/03/20180327152643_1198883_500_750.jpg\"></body></html>");
			break;
		}
	}
}
