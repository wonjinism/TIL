package io.zerone.myapp0104.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.myapp0104.VO.User;

@Repository
public class userDAO {
	// rootcontextxml에 sqlsession까지 작성해두었기 때문에 바로 @annotation으로 불러서 사용할 수 있음
	// sqlsession factory를 싱글톤 패턴으로 가져와서 session을 열어서 사용했지만,
	// 스프링 내에서는 bean이라는 객체를 통해 생성하고 가져와 쓴다.
	// jsp > controller > dao > db
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertUser(User user) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		int result =  0;
		try {
			result = mapper.insertUser(user);
//			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
//			sqlSession.close();
		}
		return result;
	}
	
}
