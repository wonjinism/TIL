package com.fileboard.fileboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fileboard.fileboard.vo.Member;

@Repository
public class MemberDAO {

	@Autowired
	SqlSession session;

	public int insertMember(Member member) {
		int result = 0;
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		try {
			result = mapper.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;
	}

	public Member selectMember(Member member) {
		Member result = null;
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		try {
			result = mapper.selectMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

}
