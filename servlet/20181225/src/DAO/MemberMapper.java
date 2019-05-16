package DAO;

import VO.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	
	public Member loginMember(Member member);
}
