package io.zerone.myapp0108.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.myapp0108.VO.Member;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertMember(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int result = 0;
		try {
			result = mapper.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;
	}

	public Member loginMember(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		Member loginMember = null;
		try {
			loginMember = mapper.loginMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return loginMember;
		}
		return loginMember;
	}
	
	
}
