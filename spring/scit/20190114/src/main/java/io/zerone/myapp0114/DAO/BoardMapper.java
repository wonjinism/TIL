package io.zerone.myapp0114.DAO;

import java.util.ArrayList;

import io.zerone.myapp0114.VO.Board;
import io.zerone.myapp0114.VO.Comment;

public interface BoardMapper {
	public int insertBoard(Board board);
	public ArrayList<Board> selectBoardList();
	public int increaseHitcount(String boardseq);
	public Board selectBoard(String boardseq);
	public int updateBoard(Board board);
	public int deleteBoard(String boardseq);
	
	public int insertComment(Comment comment);
	public ArrayList<Comment> selectComments(String boardseq);
	public int deleteComment(String commentseq);
}
