package io.zerone.myapp0110.DAO;

import java.util.ArrayList;

import io.zerone.myapp0110.VO.Board;

public interface BoardMapper {
	public int insertBoard(Board board);
	public ArrayList<Board> selectBoardList();
	public int increaseHitcount(String boardseq);
	public Board selectBoard(String boardseq);
	public int updateBoard(Board board);
	public int deleteBoard(String boardseq);
}
