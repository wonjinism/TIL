package io.zerone.Interceptor;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale) {
		System.out.println("Welcome home! The client locale is {}." + locale);
		return "home";
	}

	@RequestMapping(value = "/go", method = RequestMethod.GET)
	public String go() {
		return "go";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpSession session) {
		session.setAttribute("userId", "userId");
		return "home";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println(session.getAttribute("userId"));
		return "home";
	}
	
}
