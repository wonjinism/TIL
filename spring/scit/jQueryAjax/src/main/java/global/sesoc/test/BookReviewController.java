package global.sesoc.test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.test.dao.BookReviewDAO;
import global.sesoc.test.vo.BookReview;

@Controller
public class BookReviewController {
	@Autowired
	BookReviewDAO dao;

	@RequestMapping(value ="/", method = RequestMethod.GET)
	public String home() {
		return "book";
	}
	
	@RequestMapping(value = "/reviewWrite", method = RequestMethod.GET)
	public @ResponseBody int reviewWrite(BookReview bookReview){
		int result = dao.reviewWrite(bookReview);
		return result;
	}
	
	@RequestMapping(value = "/reviewDelete", method = RequestMethod.GET)
	public @ResponseBody int reviewDelete(int seq){
		int result = dao.reviewDelete(seq);
		return result;
	}

	@RequestMapping(value = "/reviewList", method = RequestMethod.GET)
	public @ResponseBody ArrayList<BookReview> reviewList(){
		ArrayList<BookReview> reviewList = (ArrayList<BookReview>) dao.reviewList();
		return reviewList;
	}
	
	@RequestMapping(value = "/reviewSearchList", method = RequestMethod.GET)
	public @ResponseBody ArrayList<BookReview> reviewSearchList(String search){
		ArrayList<BookReview> reviewList = (ArrayList<BookReview>) dao.reviewSearchList(search);
		return reviewList;
	}
}