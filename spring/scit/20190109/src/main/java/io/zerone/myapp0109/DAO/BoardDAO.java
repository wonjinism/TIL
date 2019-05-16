package io.zerone.myapp0109.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.myapp0109.VO.Board;

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
}
