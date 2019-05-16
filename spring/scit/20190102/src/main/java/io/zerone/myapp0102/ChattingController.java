package io.zerone.myapp0102;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChattingController {
	static ArrayList<String> messageList = new ArrayList<String>();
	
	@RequestMapping(value = "/chatting", method = RequestMethod.GET)
	public void chatting(Model model) {
		model.addAttribute("messageList", messageList);
	}
	
	@RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
	public String sendMessage(String id, String message, Model model) {
		String msg = id + " : " + message; 
		messageList.add(msg);
		
		for (String string : messageList) {
			System.out.println(string);
		}
		model.addAttribute("messageList", messageList);
		return "chatting";
	}
}
