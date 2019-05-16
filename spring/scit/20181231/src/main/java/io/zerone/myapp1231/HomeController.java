package io.zerone.myapp1231;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import VO.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	// 우리는 jsp와 controller만 만들면 된다.
	// 클라이언트가 request을 보내면 Dispatcher Servlet이 제일 먼저 받는다.
	// 요청을 처리할 대상이 있는지 handler Mapping이 검사를 한다. 
	// 이 요청을 처리할 controller가 있는지 확인해서 보내준다.
	// controller는 model과 view에 대한 정보를 dispatcher servlet에게 다시 보내줌.
	// Dispatcher servlet은 view resolver라는 객체에게 보냄.
	// view resolver는 view(jsp)를 html로 만들어서 dispatcher servlet에게 보냄.
	// dispatcher servlet은 response로 보낸다.
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
}
