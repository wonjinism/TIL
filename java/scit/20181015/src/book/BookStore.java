package book;

public class BookStore {
	public static void main(String[] args) {
		Book b1 = new Book(); // Book 클래스가 객체가 되어서 b1에 담긴다
//		System.out.println(b1.toString());
		b1.setPrice(5000); // 5000은 파라미터, 아규먼트, 지역변수 등 명칭은 다를 수 있다. 의미를 설명해서 통하게 맞춰나가라
//		System.out.println(b1.getPrice());
//		b1.printBookInfo();
		
		Book b2 = new Book(); // Book 클래스로 생성된 생성자가 2개가 되는 것
		b2.setTitle("Hello Java");
		
//		b1.printBookInfo();
//		b2.printBookInfo();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		b2 = b1;
		b2.setPage(7);
		b1.printBookInfo();
		b2.printBookInfo();

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		
	}
}