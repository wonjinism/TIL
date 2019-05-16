package io.zerone.Interceptor.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MemberInterceptor extends HandlerInterceptorAdapter {

	// 컨트롤로가 받을 수 있는 값은 인터셉터가 받을 수 있다.
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		
		if(userId != null) {
//			return super.preHandle(request, response, handler);
			return true;
		}else {
			response.sendRedirect(request.getContextPath());
			return false;
		}
	}
}
