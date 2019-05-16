package com.fileboard.fileboard.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fileboard.fileboard.util.PageNavigator;
import com.fileboard.fileboard.vo.Board;
import com.fileboard.fileboard.vo.BoardFile;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession session;

	public void insertBoard(Board board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			mapper.insertBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertFile(BoardFile file) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			mapper.insertFile(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Board> selectAllBoard(PageNavigator pn) {//게시글가져오기
		ArrayList<Board> result = null;
		
		RowBounds rb=new RowBounds(pn.getStartBoardCurrentPage(),pn.getBoardPerPage());//어디위치부터, 몇개까지
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			result = mapper.selectAllBoard(rb);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	public Board selectBoard(String boardSeq) {
		Board result = null;
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			result = mapper.selectBoard(boardSeq);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;

	}

	public ArrayList<BoardFile> selectFile(String boardSeq) {

		ArrayList<BoardFile> result = null;
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			result = mapper.selectFile(boardSeq);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;

	}

	public int countRecord() {
		int result = 0;

		BoardMapper mapper = session.getMapper(BoardMapper.class);
		try {
			result = mapper.countRecord();
		} catch (Exception e) {
			return 0;
		}

		return result;
	}

}
