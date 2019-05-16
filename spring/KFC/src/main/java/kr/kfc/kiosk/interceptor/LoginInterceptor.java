package kr.kfc.kiosk.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	// select [override and implement methods] 
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		String currentAccount = (String) session.getAttribute("account");
		
		if(currentAccount == null) {
			response.sendRedirect(request.getContextPath() + "/admin/login");
			return false;
		}
		
		return super.preHandle(request, response, handler);
	}

	

}
