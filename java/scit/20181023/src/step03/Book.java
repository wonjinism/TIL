package step03;

public class Book {
	private String bookId;
	private String Name;
	private String Summary;
	
	public Book(String bookId, String name, String summary) {
		super();
		this.bookId = bookId;
		this.Name = name;
		this.Summary = summary;
	}
	public Book() {}
	
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSummary() {
		return Summary;
	}

	public void setSummary(String summary) {
		Summary = summary;
	}
	@Override
	public String toString() {
		return "도서번호 = " + bookId + ", 도서 제목 = " + Name + ", 도서내용 = " + Summary;
	}
	
}
