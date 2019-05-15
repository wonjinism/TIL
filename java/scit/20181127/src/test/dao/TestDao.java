package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class TestDao {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// 회원 정보 저장
	public void insertPerson(Person p) {
		SqlSession ss = null;
		ss = factory.openSession();
		PersonMapper mapper = ss.getMapper(PersonMapper.class);
		mapper.insertPerson(p);
		ss.commit();
		ss.close();
	}
	
	public ArrayList<Person> selectPerson(){
		ArrayList<Person> list = null;
		SqlSession ss = null;
		
		ss = factory.openSession();
		PersonMapper mapper = ss.getMapper(PersonMapper.class);
		list = mapper.selectPerson();
		ss.commit();
		ss.close();
		return list;
	}
}