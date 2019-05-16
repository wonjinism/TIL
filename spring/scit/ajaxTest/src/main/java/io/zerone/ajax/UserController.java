package io.zerone.ajax;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping(value="/createUser", method = RequestMethod.GET)
	public @ResponseBody String createUser(String userId, String password) {
		ArrayList<String> userIdList = new ArrayList<String>();
		userIdList.add("zerone");
		
		System.out.println(userId + " " + password);
		if(!(userIdList.contains(userId))){
			return "success";
		}
		return "duplicated";
	}
}
