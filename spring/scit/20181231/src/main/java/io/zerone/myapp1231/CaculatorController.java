package io.zerone.myapp1231;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CaculatorController {
	@RequestMapping(value = "/calculator", method = RequestMethod.GET)
	public void calculator() {

	}

	@RequestMapping(value = "/logic", method = RequestMethod.GET)
	public String logic(int x, int y, String logic, Model model) {
		String result = null;
		if(logic.equals("plus")) {
			result = String.valueOf(x + y);
		}else if(logic.equals("minus")) {
			result = String.valueOf(x - y);
		}else if(logic.equals("times")) {
			result = String.valueOf(x * y);
		}else if(logic.equals("divide")) {
			result = String.valueOf((double)x / y);
		}
		model.addAttribute("result", result);
		return "calculator";
	}	
}
