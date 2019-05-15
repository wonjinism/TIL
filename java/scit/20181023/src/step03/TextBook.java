package step03;

public class TextBook extends Book {
	private String pageNum;

	public TextBook(String bookId, String name, String summary, String pageNum) {
		super(bookId, name, summary);
		this.pageNum = pageNum;
	}

	public String getPageNum() {
		return pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	@Override
	public String toString() {
		return super.toString() + ", 페이지 수 = " + pageNum;
	}
}
