package step03;

public class Person {
	private String password = "12345";
	
	public class Inner{
		public void innerTest() {
			// Outer Class의 private 속성에 접근 가능
			System.out.println(password);
		}
	}
}