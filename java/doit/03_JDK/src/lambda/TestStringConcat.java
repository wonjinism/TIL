package lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		// lambda expression
		StringConcat concat2 = (str1, str2) -> {System.out.println(str1 + ", " + str2);};
		concat2.makeString(s1, s2);
	}
}
