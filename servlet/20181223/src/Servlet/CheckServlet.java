package Servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

@WebServlet("/check")
public class CheckServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] star = req.getParameterValues("star");
		resp.getWriter().print("<html><head><style>img{width:400px;height:auto}</style></head><body>");
		for (String string : star) {
			switch (string) {
			case "iu":
				resp.getWriter().println("<img src=\"http://file2.nocutnews.co.kr/newsroom/image/2018/07/18/20180718120948825781_0_420_600.jpg\">");
				break;
			case "ha":
				resp.getWriter().println("<img src=\"https://img.huffingtonpost.com/asset/5bc5345d1f00000403259609.jpeg?ops=scalefit_630_noupscale\">");
				break;
			case "kth":
				resp.getWriter().println("<img src=\"http://img.etoday.co.kr/pto_db/2018/03/20180327152643_1198883_500_750.jpg\">");
				break;
			}			
		}
		resp.getWriter().println("</body></html>");
	}
}
