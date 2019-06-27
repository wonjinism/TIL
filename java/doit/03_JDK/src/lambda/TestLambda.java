package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello lambda_1");
		showMyString(lambdaStr);
		PrintString reStr = returnString();
		reStr.showString("Hello ");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Hello lambda_2");
	}
	
	public static PrintString returnString() {
//		PrintString str = s -> System.out.println(s + "world");
//		return str;
		return s -> System.out.println(s + "world");
	}
}
