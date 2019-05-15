package test.main;

import java.util.ArrayList;

import test.dao.TestDao;
import test.vo.Person;

public class TestMain {
	public static void main(String[] args) {
		TestDao dao = new TestDao();
		Person p = new Person(2, "김철수", 20, "010-0000-0000", "경기도 일산");
		dao.insertPerson(p);
		
		ArrayList<Person> list = dao.selectPerson();
		for (Person p1 : list) {
			System.out.println(p1);
		}
	}
}

