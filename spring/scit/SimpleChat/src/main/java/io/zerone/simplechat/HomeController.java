package io.zerone.simplechat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		System.out.println("Welcome home! The client locale is {}.");

		return "home";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void join() {
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public void home() {
	}
}
