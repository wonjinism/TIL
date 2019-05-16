package io.zerone.moneydiary;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public void account() {
	}	

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void join() {
	}
	
}
