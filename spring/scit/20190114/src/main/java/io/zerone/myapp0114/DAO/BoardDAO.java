package io.zerone.myapp0114.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.myapp0114.VO.Board;
import io.zerone.myapp0114.VO.Comment;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession session;

	public int insertBoard(Board board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		try {
			result = mapper.insertBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	public ArrayList<Board> selectBoardList() {
		ArrayList<Board> boardList = null;
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			boardList = mapper.selectBoardList();
		} catch (Exception e) {
			e.printStackTrace();
			return boardList;
		}
		return boardList;
	}
	
	public int increaseHitcount(String boardseq) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		try {
			result = mapper.increaseHitcount(boardseq);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public Board selectBoard(String boardseq) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Board board = null;
		try {
			board = mapper.selectBoard(boardseq);
		} catch (Exception e) {
			e.printStackTrace();
			return board;
		}
		return board;
	}
	
	public int updateBoard(Board board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		try {
			result = mapper.updateBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public int deleteBoard(String boardseq) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		try {
			result = mapper.deleteBoard(boardseq);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public int insertComment(Comment comment) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		try {
			result = mapper.insertComment(comment);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		} 
		return result;
	}
	
	public ArrayList<Comment> selectComments(String boardseq){
		ArrayList<Comment> comments = null;
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			comments = mapper.selectComments(boardseq);			
		} catch (Exception e) {
			e.printStackTrace();
			return comments;
		}
		return comments;
	}
	
	public int deleteComment(String commentseq) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		try {
			result = mapper.deleteComment(commentseq);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
