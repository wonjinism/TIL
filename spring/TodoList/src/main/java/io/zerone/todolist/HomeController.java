package io.zerone.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:/selectTodoList";
	}

	@RequestMapping(value = "/newTodo", method = RequestMethod.GET)
	public void newTodo() {
	}
}
