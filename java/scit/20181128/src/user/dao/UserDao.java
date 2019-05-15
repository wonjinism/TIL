package user.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import user.vo.User;

public class UserDao {
	// DB 정보를 담은 마이바티스 객체
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// 전체회원 목록 출력
	public ArrayList<User> listUser(){
		ArrayList<User> list = null;
		SqlSession session = null;
		
		try {
			session = factory.openSession(); // Exception
			UserMapper mapper = session.getMapper(UserMapper.class); // UserMapper interface 통째로 mapper에 연결
			list = mapper.listUser();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	// 회원 정보 저장
	public boolean insertUser(User user) {
		SqlSession session = null; // DB 연결과 SQL을 실행하는 객체
		int returnNum = 0;
		
		try {
			session = factory.openSession(); // Exception
			UserMapper mapper = session.getMapper(UserMapper.class);
			// UserMapper interface에 담겨 있는 SQL mapper로 객체에 담기
			returnNum = mapper.insertUser(user);
			
			if (user.getPhone() != null && !user.getPhone().isEmpty() && user.getAddress() != null && !user.getAddress().isEmpty()) {
				mapper.insertAddress(user);
			} // .isEmpty()를 통해 String의 길이가 0이 아닌 것까지 확인할 수 있다.
			session.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) { // 자바 프로그램 오류일 때는 null이 발생하므로 그럴 때는 close할 필요 없으므로
				session.close();
			}
		}
		if(returnNum >= 1) {
			return true;
		}else {
			return false;
		}
	}
	
	// 회원 정보 저장
	public boolean deleteUser(String deleteId) {
		SqlSession session = null; // DB 연결과 SQL을 실행하는 객체
		int returnNum = 0;
		
		try {
			session = factory.openSession(); // Exception
			UserMapper mapper = session.getMapper(UserMapper.class);
			// UserMapper interface에 담겨 있는 SQL mapper로 객체에 담기
			returnNum = mapper.deleteUser(deleteId);
			session.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) { // 자바 프로그램 오류일 때는 null이 발생하므로 그럴 때는 close할 필요 없으므로
				session.close();
			}
		}
		if(returnNum >= 1) {
			return true;
		}else {
			return false;
		}
	}
}