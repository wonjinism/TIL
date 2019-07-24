package iterator;
import java.util.ArrayList;

public class BookShelf implements Aggregate {
	private ArrayList<Book> books;
	private int last = 0;
	public BookShelf() {
		this.books = new ArrayList<Book>();
	}
	public Book getBookAt(int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}
	public int getLength() {
		return last;
	}
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
