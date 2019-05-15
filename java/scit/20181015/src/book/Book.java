package book;

public class Book {
	String title;
	int page;
	int price;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}
	/**
	 * @return 설정되어 있는 가격
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param 설정할 가격
	 */
	public void setPrice(int price) { // int price는 지역변수　ロウカル変数　메소드 안에서만 사용됨
		this.price = price; // this.price는 클래스의 전역변수 
	}
	public void printBookInfo() {
		System.out.println("title : " + title + ", page : " + page + ", price : " + price);
	}
	/* 
	 * 
	 * 전체 출력
	 */
	@Override
	public String toString() { 
		return "Book [title=" + title + ", page=" + page + ", price=" + price + "]";
	}

}
