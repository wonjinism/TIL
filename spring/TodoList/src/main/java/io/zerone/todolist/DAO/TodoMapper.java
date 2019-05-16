package io.zerone.todolist.DAO;

import java.util.ArrayList;

import io.zerone.todolist.VO.Todo;

public interface TodoMapper {
	public ArrayList<Todo> selectTodoList();
	public int insertTodo(Todo todo);
	public int updateTodo(Todo todo);
}
