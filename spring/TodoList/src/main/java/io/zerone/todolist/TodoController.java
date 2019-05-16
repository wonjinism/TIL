package io.zerone.todolist;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.zerone.todolist.DAO.TodoDAO;
import io.zerone.todolist.VO.Todo;

@Controller
public class TodoController {

	@Autowired
	TodoDAO dao;

	@RequestMapping(value = "/selectTodoList", method = RequestMethod.GET)
	public String selectTodoList(Model model) {
		ArrayList<Todo> todoList = dao.selectTodoList();
		model.addAttribute(todoList);
		return "home";
	}

	@RequestMapping(value = "/newTodo", method = RequestMethod.POST)
	public String insertTodo(Todo todo) {
		dao.insertTodo(todo);
		return "redirect:/selectTodoList";
	}

	@RequestMapping(value = "/moveTodo", method = RequestMethod.GET)
	public String updateTodo(Todo todo) {
		System.out.println(todo.getId());
		System.out.println(todo.getType());
		dao.updateTodo(todo);
		return "redirect:/selectTodoList";
	}
}
