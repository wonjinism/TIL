package io.zerone.simplechat.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.simplechat.VO.User;

@Repository
public class UserDAO {
	
	@Autowired
	SqlSession session;
	
	public int insertUser(User user) {
		UserMapper mapper = session.getMapper(UserMapper.class);
		int result = 0;
		try {
			mapper.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public User selectUser(User user) {
		UserMapper mapper = session.getMapper(UserMapper.class);
		User returnUser = null;
		try {
			returnUser = mapper.selectUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return returnUser;
		}
		return returnUser;
	}
	
}
