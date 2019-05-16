package com.fileboard.fileboard.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.fileboard.fileboard.vo.Board;
import com.fileboard.fileboard.vo.BoardFile;

public interface BoardMapper {

	public ArrayList<Board> selectAllBoard(RowBounds rb);

	public Board selectBoard(String boardSeq);

	public ArrayList<BoardFile> selectFile(String boardSeq);

	public void insertBoard(Board board);

	public void insertFile(BoardFile file);
	
	public int countRecord();

}
