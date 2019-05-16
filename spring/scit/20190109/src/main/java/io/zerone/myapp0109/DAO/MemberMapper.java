package io.zerone.myapp0109.DAO;

import io.zerone.myapp0109.VO.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public Member loginMember(Member member);
}
