package global.sesoc.test.dao;

import java.util.List;
import java.util.Map;

import global.sesoc.test.vo.BookReview;

public interface BookReviewMapper {
	public List<BookReview> reviewList() throws Exception;
	public List<BookReview> reviewList(String search) throws Exception;
	public int reviewWrite(BookReview bookReview) throws Exception;
	public int reviewDelete(int seq) throws Exception;
}
