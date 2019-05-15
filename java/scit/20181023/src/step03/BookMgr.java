package step03;

public class BookMgr { // 배열을 관리, 전체 출력
	
	private Book bookArray[] =  new Book[100];
	private int index = 0;

	public void addBook(Book book) {
		bookArray[index++] = book;
	}
	
	public Book searchBook(String bookId) {// 도서검색
		for (int i = 0; i < index; i++) {
			if (bookArray[i].getBookId().equals(bookId)) {
				return bookArray[i];
			}
		}
		return null;
	}
	
	public void printAll() {
		for (int i = 0; i < index; i++) {
			System.out.println(bookArray[i]);
		}				
	}
}
