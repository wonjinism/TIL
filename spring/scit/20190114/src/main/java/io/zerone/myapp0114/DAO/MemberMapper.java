package io.zerone.myapp0114.DAO;

import io.zerone.myapp0114.VO.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public Member loginMember(Member member);
}
