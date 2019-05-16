package io.zerone.myapp0109.DAO;

import io.zerone.myapp0109.VO.Board;

public interface BoardMapper {
	public int insertBoard(Board board);
	public Board selectBoard();
}
