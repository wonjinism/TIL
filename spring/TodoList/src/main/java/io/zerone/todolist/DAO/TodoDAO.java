package io.zerone.todolist.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.todolist.VO.Todo;

@Repository
public class TodoDAO {

	@Autowired
	SqlSession session;
	
	public int insertTodo(Todo todo) {
		TodoMapper mapper = session.getMapper(TodoMapper.class);
		int result = 0;
		try {
			result = mapper.insertTodo(todo);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public ArrayList<Todo> selectTodoList() {
		TodoMapper mapper = session.getMapper(TodoMapper.class);
		ArrayList<Todo> todoList = null;
		try {
			todoList = mapper.selectTodoList();
		} catch (Exception e) {
			e.printStackTrace();
			return todoList;
		}
		return todoList;
	}
	
	public int updateTodo(Todo todo) {
		TodoMapper mapper = session.getMapper(TodoMapper.class);
		int result = 0;
		try {
			result = mapper.updateTodo(todo);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
}
