package com.fileboard.fileboard.dao;

import com.fileboard.fileboard.vo.Member;

public interface MemberMapper {

	public int insertMember(Member member);//회원가입
	public Member selectMember(Member member);//회원로그인
}
