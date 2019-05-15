package test.dao;

import java.util.ArrayList;

import test.vo.Person;

public interface PersonMapper {
	// Person 객체 저장하는 SQL
	public int insertPerson(Person p);
	
	// Person 객체 목록 읽는 SQL
	public ArrayList<Person> selectPerson();
	
}
