package io.zerone.myapp0110.DAO;

import io.zerone.myapp0110.VO.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public Member loginMember(Member member);
}
