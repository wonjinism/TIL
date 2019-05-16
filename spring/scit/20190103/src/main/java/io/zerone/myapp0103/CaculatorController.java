package io.zerone.myapp0103;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
			try {
				result = String.valueOf((double)x / y);
			} catch(Exception e) {
				model.addAttribute("warning", "0으로 나눌 수 없습니다.");
				return "calculator";
			}
		}
		model.addAttribute("result", result);
		return "calculator";
	}
}
