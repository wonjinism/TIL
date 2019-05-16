package DAO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import VO.Member;

public class MemberDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public int insertMember(Member member) {
		SqlSession session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int result = 0;
		try{
			result = mapper.insertMember(member);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			session.close();
		}
		return result;
	}
	
	public Member loginMember(Member member) {
		SqlSession session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		Member resultMember;
		try {
			resultMember = mapper.loginMember(member);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			session.close();
		}
		return resultMember;
	}
}
