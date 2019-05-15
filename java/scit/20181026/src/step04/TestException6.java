package step04;

public class TestException6 {
	public static void main(String[] args) {
		String s[] = {"a", "b"};
		try {
			System.out.println(s[2]);
			System.out.println(1);
		}catch (NullPointerException ne) {
			System.out.println(2);
		}catch (Exception e) {
			System.out.println(3);
		}finally{
			System.out.println(4);
		}
		System.out.println(5);
	}
}
