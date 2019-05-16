package io.zerone.myapp0108.DAO;

import io.zerone.myapp0108.VO.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public Member loginMember(Member member);
}
