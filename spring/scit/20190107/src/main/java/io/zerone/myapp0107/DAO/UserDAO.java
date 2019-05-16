package io.zerone.myapp0107.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.myapp0107.VO.User;

@Repository // service controller component repository
public class UserDAO {
	@Autowired
	SqlSession sqlSession;
	
	public int insertUser(User user) {
		int result = 0;
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		try {
			result = mapper.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;
	}
}
