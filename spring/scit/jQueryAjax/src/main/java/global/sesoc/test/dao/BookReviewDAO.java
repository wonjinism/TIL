package global.sesoc.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.test.vo.BookReview;

@Repository
public class BookReviewDAO {
	
	@Autowired
	SqlSession session;

	private static final Logger logger = LoggerFactory.getLogger(BookReviewDAO.class);

	public List<BookReview> reviewList() {
		//
		ArrayList<BookReview> reviewList = null;
		BookReviewMapper mapper = session.getMapper(BookReviewMapper.class);
		try {
			reviewList = (ArrayList<BookReview>) mapper.reviewList();
		} catch (Exception e) {
			e.printStackTrace();
			return reviewList;
		}
		return reviewList;
	}
	
	public List<BookReview> reviewSearchList(String search) {
		//
		ArrayList<BookReview> reviewList = null;
		BookReviewMapper mapper = session.getMapper(BookReviewMapper.class);
		try {
			reviewList = (ArrayList<BookReview>) mapper.reviewList(search);
		} catch (Exception e) {
			e.printStackTrace();
			return reviewList;
		}
		return reviewList;
	}
	
	
	public int reviewWrite(BookReview bookReview) {
		//
		int result = 0;
		BookReviewMapper mapper = session.getMapper(BookReviewMapper.class);
		try {
			result = mapper.reviewWrite(bookReview);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
	public int reviewDelete(int seq) {
		//
		int result = 0;
		BookReviewMapper mapper = session.getMapper(BookReviewMapper.class);
		try {
			result = mapper.reviewDelete(seq);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
}
