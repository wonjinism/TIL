package DAO;

import java.util.ArrayList;

import VO.Board;
import VO.Member;

public interface MemberMapper {
	public int insertMember(Member member); // 회원가입
	public Member loginMember(Member member); // 로그인
	public void insertBoard(Board board); // 게시물 등록
	public ArrayList<Board> selectBoard(); // 게시물 가져오기
	public int deleteBoard(Board board); // 게시물 삭제
}
